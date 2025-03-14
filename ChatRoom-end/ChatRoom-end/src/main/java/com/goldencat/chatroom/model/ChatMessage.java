package com.goldencat.chatroom.model;

public class ChatMessage {
    private String username;
    private String content;

    // Constructor, getters, and setters
    public ChatMessage(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}