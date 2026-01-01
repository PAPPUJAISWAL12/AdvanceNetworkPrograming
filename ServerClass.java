
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass{
    public static void main(String[] args){
        try{
            ServerSocket Ssocket=new ServerSocket(5000);
            System.out.println("Server is running... waiting for client connection");
            Socket socket =Ssocket.accept();
            System.out.println("Clinet is connected");
            OutputStream output=socket.getOutputStream();
            PrintWriter writer=new PrintWriter(output,true);
            writer.println("Hello Hemnarayan");
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String clientMessage="",serverMsg="";
            while(true){
                
                clientMessage=reader.readLine();
                if(clientMessage==null || clientMessage.equalsIgnoreCase("exit")){
                    System.out.println("Client disconnected");
                    break;
                }
                System.out.println("Message from client: "+clientMessage);
                System.out.println("server msg : ");
                serverMsg=br.readLine();
                writer.println(serverMsg);

            
            }           
            
        
           
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       
    }
}