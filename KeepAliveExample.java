import java.net.*;

public class KeepAliveExample {
    public static void main(String[] args)throws Exception {
        URL url = new URL("https://www.tutorialspoint.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Connection", "keep-alive");
        connection.connect();
        System.out.println("Response Code: " + connection.getResponseCode());
        connection.disconnect();
        System.out.println("Connection closed." );
    }
}
