import java.io.*;
import java.net.*;

public class CreateSocketwithoutConstructor {
   public static void main(String[] args) {
    try{
        try (Socket socket = new Socket()) {
            InetSocketAddress inetSocketAddress=new InetSocketAddress("localhost",5000);
            socket.connect(inetSocketAddress);
            BufferedReader rd=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(rd.readLine());
            if(socket.isConnected()){
                System.out.println("Socket is connected to "+socket.getRemoteSocketAddress());
                System.out.println(socket.getLocalSocketAddress());
            }
        }
        
    }catch(Exception ex){
        ex.printStackTrace();
    }
   } 
}
