import java.io.*;
import java.net.*;

public class SocketForClient {
    public static void main(String[] args) {
        try{
          
            Socket s=new Socket("localhost",5000);
            s.setSoTimeout(15000);
            InputStream input=s.getInputStream();
            BufferedReader rd=new BufferedReader(new InputStreamReader(input));
            String line;
            while((line=rd.readLine())!=null){
                System.out.println(line);
            }
            rd.close();
            s.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
