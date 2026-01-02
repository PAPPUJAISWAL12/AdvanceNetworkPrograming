import java.io.*;
import java.net.*;
public class WrittingServer {
    public static void main(String[] args) {
        try{
            Socket socket=new Socket("localhost",5000);
            OutputStream os=socket.getOutputStream();
            PrintWriter pr=new PrintWriter(os,true);
           
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
             pr.println("Hello from WrittingServer");
            String ServerMsg,cmsg;
            while (true) {
                ServerMsg=br.readLine();
                if(ServerMsg==null || ServerMsg.equalsIgnoreCase("exit")){
                    System.out.println("Server disconnected");
                    break;
                }
                System.out.println("Message from server: "+ServerMsg);
                System.out.println("Client message: ");
                cmsg=reader.readLine();
                pr.println(cmsg);
            }
            br.close();
            pr.close();
            socket.close();
        }catch(Exception ex){
            ex.printStackTrace();}
    }
}
