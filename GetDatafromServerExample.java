import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
public class GetDatafromServerExample {
    public static void main(String[] args)throws Exception {
       try{

        URL url=new URL("https://www.tutorialspoint.com/");
        URLConnection urlConnection=url.openConnection();
        
        urlConnection.connect();
        /*====Example 1==== 
        try(InputStream stream=urlConnection.getInputStream()){
            int data=stream.read();
            while(data!=-1){
                System.out.print((char)data);               
            }
        }*/
/*====Example 2==== */
        try(BufferedReader rd=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
            String line;
            while((line=rd.readLine())!=null){
                System.out.println(line);
            }
        }
    }catch(Exception e){
        System.out.println("Exception occurred");
        e.printStackTrace();
    }
    }
}