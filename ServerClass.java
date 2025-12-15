package AdvanceNetwork;
import java.io.OutputStream;
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
            writer.close();
            socket.close();
            Ssocket.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
       
    }
}