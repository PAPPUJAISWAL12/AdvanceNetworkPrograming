package AdvanceNetwork;

import java.net.URL;
import java.net.URLStreamHandler;

public class urlmethod {
    private static final URLStreamHandler URLStreamHandler = null;

    public static void main(String[] args) throws Exception{
        URL url=new URL("https","www.w3schools.com",80,"/css/default.asp",null);

        
        System.out.println("Host:"+url.getHost());
        System.out.println("Port:"+url.getPort());
        System.out.println("protocol:"+url.getProtocol());
        System.out.println("Authority:"+url.getAuthority());
        System.out.println("file:"+url.getFile());
        System.out.println(url.getPath());
        System.out.println(url.getQuery());
    }
}