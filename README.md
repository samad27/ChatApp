✨ BB ChatRoom - Real-Time Group Chat Application

Welcome to BB ChatRoom!🚀 A sleek, real-time chat application where users can create or join rooms and chat with others in a structured and visually appealing environment. Built with Spring Boot, WebSocket, and Thymeleaf, this project offers a seamless and interactive chatting experience.

🎨 Features
- Real-Time Messaging: Powered by WebSocket for instant message delivery.
- Room-Based Chat: Users can create or join chat rooms for separate conversations.
- Modern UI: Clean, responsive design with gradient backgrounds and smooth animations.
- User-Friendly: Simple login, intuitive chat interface, and interactive buttons.
- Dynamic Notifications: Alerts when users join or leave a room.

🛠 Technologies Used

Category---	         Technologies

Backend	---           Spring Boot, WebSocket (STOMP)

Frontend---       Thymeleaf, HTML5, CSS3, JavaScript

Styling---	           Bootstrap 4, Font Awesome

Build Tool---	       Maven
 
🚀 Getting Started
Prerequisites
- Java 17
- Maven 3.8+
- A modern web browser (Chrome, Firefox, Edge)

Installation
- Clone the repository
- bash
   cd goldencat-chatroom
- Run the application
   mvn spring-boot:run
- Open in browser
   Visit http://localhost:8080 to start chatting!

📸 Screenshots
- Login Page
![image](https://github.com/user-attachments/assets/597de2c2-3fd4-464d-b127-ab4fda84717b)


- Chat Room
![image](https://github.com/user-attachments/assets/c7006516-6d09-4df9-b98f-72bb306a6b6b)

```
🔧 Project Structure
📦 src
└── 📂 main
    ├── 📂 java
    │   └── 📂 com
    │       └── 📂 goldencat
    │           └── 📂 chatroom
    │               ├── 📄 ChatroomApplication.java       # Main Spring Boot app
    │               ├── 📂 config
    │               │   └── 📄 WebSocketConfig.java       # WebSocket configuration
    │               ├── 📂 controller
    │               │   └── 📄 ChatController.java        # Handles chat logic
    │               └── 📂 model
    │                   └── 📄 ChatMessage.java           # Message model
    └── 📂 resources
        ├── 📂 static                                     # CSS/JS
        └── 📂 templates
            ├── 📄 chat.html                              # Chat UI
            └── 📄 login.html                             # Login UI

📄 pom.xml                                                # Maven dependencies
```


🎯 Future Enhancements
- User Authentication (JWT/OAuth)
- Message History (Database integration)
- Emoji Support 😊
- File Sharing (Images, PDFs)
