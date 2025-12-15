package AdvanceNetwork;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try{
           Socket socket=new Socket("localhost",5000);

           InputStream input=socket.getInputStream();
           BufferedReader reader=new BufferedReader(new InputStreamReader(input));
           String message=reader.readLine();
           System.out.println(message);
           reader.close();
           socket.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
       
    }
}
