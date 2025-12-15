package AdvanceNetwork;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLOpenConnection {
    public static void main(String[] args) throws Exception{
        URL url=new URL("https://www.google.com/");
        URLConnection openConnection=url.openConnection();
        InputStream in=openConnection.getInputStream();
        int c;
        while((c=in.read())!=-1){
            System.out.write(c);
         
        }
    }
}
