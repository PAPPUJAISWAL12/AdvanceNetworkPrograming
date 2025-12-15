package AdvanceNetwork;

import java.io.InputStream;
import java.net.URL;

public class ReterivingOpenstream {
    public static void main(String[] args) throws Exception {
        URL url=new URL("https://www.w3schools.com/");
        InputStream in=url.openStream();
        int c;
        while((c=in.read())!=-1){
            System.out.write(c);
            // System.out.println(url.getContent());
        }
        System.err.println("null");
    }
}
