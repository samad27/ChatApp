package com.goldencat.chatroom.controller;

import com.goldencat.chatroom.model.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable; // Add this import
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.HtmlUtils;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ChatController {
    private Map<String, String> rooms = new HashMap<>(); // In-memory storage for rooms

    @MessageMapping("/chat/{roomId}")
    @SendTo("/topic/messages/{roomId}")
    public ChatMessage send(@DestinationVariable String roomId, ChatMessage message) throws Exception {
        return new ChatMessage(HtmlUtils.htmlEscape(message.getUsername()), HtmlUtils.htmlEscape(message.getContent()));
    }

    @MessageMapping("/leave/{roomId}")
    @SendTo("/topic/messages/{roomId}")
    public ChatMessage leave(@DestinationVariable String roomId, ChatMessage message) throws Exception {
        return new ChatMessage(HtmlUtils.htmlEscape(message.getUsername()), HtmlUtils.htmlEscape(message.getUsername() + " has left the chat"));
    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String username, @RequestParam String roomId, Model model) {
        model.addAttribute("username", username);
        model.addAttribute("roomId", roomId);
        return "chat";
    }

    @GetMapping("/createRoom")
    public String createRoom(@RequestParam String username, @RequestParam String roomName, Model model) {
        rooms.put(roomName, username); // Create a new room
        return "redirect:/chat?username=" + username + "&roomId=" + roomName;
    }

    @GetMapping("/joinRoom")
    public String joinRoom(@RequestParam String username, @RequestParam String roomId, Model model) {
        if (rooms.containsKey(roomId)) {
            return "redirect:/chat?username=" + username + "&roomId=" + roomId;
        } else {
            return "redirect:/?error=Room not found";
        }
    }
}