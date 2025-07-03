import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("localhost",5000);
        System.out.println("connected");


        PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);//written to server
        BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream())); //read from server

        BufferedReader console=new BufferedReader(new InputStreamReader(System.in));


        String clientmsg,servermsg;
        while(true)
        {
            System.out.print("you :");
            clientmsg=console.readLine();
            if(clientmsg.equalsIgnoreCase("q"))
            {
                writer.println(clientmsg);
                break;
            }
            writer.println(clientmsg);
            servermsg=reader.readLine();
            if(servermsg.equalsIgnoreCase("q"))
            {
                System.out.println("server OFFLINE ");
                break;
            }
            System.out.println("server says :"+servermsg);

        }

    }
}

