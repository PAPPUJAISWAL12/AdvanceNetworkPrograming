import java.io.*;
import java.net.*;
import java.sql.Date;
public class UseCacheExample {
    public static void main(String[] args)throws Exception {
        URL url=new URL("https://www.tutorialspoint.com/");
    
        URLConnection con=url.openConnection();
        con.setUseCaches(false);
        con.setDoOutput(true);
        
        con.connect();
        System.out.println("Is cache used: " + con.getUseCaches());
        System.out.println(new Date(con.getDate()).getTime()-new Date(con.getLastModified()).getTime());
      
        if(con.getDoOutput()==true){
            try(BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                
            }
        }
        }else{
            System.out.println("sorry you are not allowed to read data");
        }
    }
}
