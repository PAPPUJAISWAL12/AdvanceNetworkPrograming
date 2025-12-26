import java.net.*;

public class HTTPURLconnectionexample {
 public static void main(String[] args) {
    try{
        URL url=new URL("https://www.w3schools.com/css/default.asp");
        HttpURLConnection httpcon=(HttpURLConnection)url.openConnection();
          httpcon.setFixedLengthStreamingMode(1024);
        httpcon.setRequestMethod("GET");
        httpcon.connect();
        int code=httpcon.getResponseCode();
        String msg=httpcon.getResponseMessage();

        System.out.println("http get Method:"+httpcon.getRequestMethod());
        System.out.println("response code:"+code+"message:"+msg );
      
       System.out.println("fixed length streaming mode:" );


    }catch(Exception ex){
        ex.printStackTrace();
    }
 }   
}
