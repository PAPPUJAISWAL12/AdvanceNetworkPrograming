import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class URLOpenConnectionExample{
    public static void main(String[] args)throws Exception {
        URL url=new URL("https://www.geeksforgeeks.org/");
        URLConnection con=url.openConnection();
        con.connect();
         System.out.println(new Date(con.getDate()));
        
      if(con.getDoInput()==true) { System.out.println("Doinput"+con.getDoInput());}
        
    }
}