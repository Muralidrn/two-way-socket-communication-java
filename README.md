# Java Two-Way Socket Communication

This is a simple Java-based client-server chat application demonstrating **two-way communication** using TCP sockets.

## 📌 Features

- Bi-directional (two-way) message exchange between client and server
- Console-based user interface
- Graceful shutdown with `'q'` command
- Demonstrates core Java networking concepts

## 🛠 Technologies Used

- Java (Standard Edition)
- TCP Sockets
- Input/Output Streams
- BufferedReader & PrintWriter

## 📁 Project Structure

.
├── Client.java
└── Server.java

markdown
Copy
Edit

## 🚀 How to Run the Project

1. **Compile the Java files**

   ```bash
   javac Server.java
   javac Client.java
Start the Server

bash
Copy
Edit
java Server
Start the Client (in a separate terminal or machine)

bash
Copy
Edit
java Client
💬 Chat Usage
After both client and server are running, start typing messages.

Either side can type q to quit and terminate the connection.

Example Session:
Client terminal:

arduino
Copy
Edit
you : Hello Server!
server says : Hello Client!
Server terminal:

arduino
Copy
Edit
client says : Hello Server!
you : Hello Client!
