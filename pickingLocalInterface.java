import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class pickingLocalInterface {
    public static void main(String[] args)throws IOException {

        try{
            InetAddress address=InetAddress.getByName("localhost");           
            int i;
          
            for(i=1024;i<=65535;i++){
                Socket socket=new Socket("localhost",5000,address,i);
                BufferedReader rd=new BufferedReader(new InputStreamReader(socket.getInputStream()));
                System.out.println(rd.readLine());
                if(socket.isConnected()){
                    System.out.println("Connected with local port: "+socket.getLocalPort());
                }
               
            }
        }catch(Exception ex){
ex.printStackTrace();
        }
    }
}