# Java Socket-Based Two-Way Communication

This project demonstrates a simple two-way communication system between a client and a server using TCP sockets in Java.

## Overview

The application allows a server and a client to communicate through a TCP connection using console input. It showcases Java's networking capabilities through blocking I/O with `Socket` and `ServerSocket`.

## Features

- Two-way communication using TCP
- Console-based message exchange
- Clean shutdown with `q` command
- Demonstrates basic socket programming concepts

## Requirements

- Java Development Kit (JDK) 8 or higher
- Terminal or command-line environment

## Project Structure
|---client.java

|---server.java

shell
Copy
Edit

## Compilation and Execution

### 1. Compile the Java source files

```bash
javac Server.java
javac Client.java
```
2. Start the server (in the first terminal)
```bash
java Server
```
3. Start the client (in the second terminal or on a different machine)
```bash
java Client
```
Usage
Both the server and the client can type and send messages.

Enter `q` to terminate the session from either side.

Example Interaction

Client terminal:

```bash
you : Hello Server
server says : Hello Client
Server terminal:
```

```
client says : Hello Server
you : Hello Client
```

Port and Network Notes
The server listens on TCP port 5000.

Ensure this port is not blocked by firewalls if using multiple machines.
