import java.io.IOException;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("wait for client .....");

        Socket socket = server.accept();
        System.out.println("client connected");


       BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream())); //read from client
       PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);  //written to client

       BufferedReader console=new BufferedReader(new InputStreamReader(System.in));

       String clientmsg,servermsg;
       while(true)
       {
           clientmsg=reader.readLine();
           if(clientmsg.equalsIgnoreCase("q"))
           {
               System.out.println(" client OFFLINE ");
               break;
           }
           System.out.println("client says :"+clientmsg);
           System.out.print("you :");
           servermsg=console.readLine();
           if(servermsg.equalsIgnoreCase("q"))
           {
               writer.println(servermsg);
               break;
           }

           writer.println(servermsg);
       }





    }
}