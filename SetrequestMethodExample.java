import java.io.InputStream;
import java.net.*;
public class SetrequestMethodExample {
    public static void main(String[] args) {
        try{//https://www.example.com/example.png
            URL url=new URL("https://www.w3schools.com/css/default.asp");
            URLConnection uc=url.openConnection();
            uc.setRequestProperty("Request-Method", "GET");
            uc.addRequestProperty("connection", "keep-alive");
            uc.setRequestProperty("Cookie",
               "username=elharo; password=ACD0X9F23JJJn6G; session=100678945");

            uc.connect();
            System.out.println("Request Method: " + uc.getRequestProperty("Request-Method"));
            System.out.println("Connection: " + uc.getRequestProperty("connection"));
            System.out.println("Cookie: " + uc.getRequestProperty("Cookie"));
            // Mime Midea Type
            String contentType=URLConnection.guessContentTypeFromName("example.png");
            System.out.println("Content Type: " + contentType);
           
            InputStream stream=url.openStream();
             String content=URLConnection.guessContentTypeFromStream(stream);
             System.out.println("Content Type from Stream: " + content);


        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
