package AdvanceNetwork;

import java.net.InetAddress;

public class InetAddressClas {
    public static void main(String[] arg) {
        
        try{
            InetAddress addr=InetAddress.getLocalHost();
            System.out.println("Address:");
            System.out.println( addr.getHostAddress());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}