package AdvanceNetwork;
import java.net.*;

public class IpaddressVersion {
    public static int getVersion( InetAddress addr){
       
        byte [] baddr=addr.getAddress();
        if(baddr.length==4){
            return 4;
        }else{
            return 6;
        }
      
    }
    public static void main(String[] args){
        try{
            InetAddress addr=InetAddress.getLocalHost();
            //ip address detect 
            System.out.println("host address"+addr.getHostAddress());
            int v=getVersion(addr);
            System.out.println("Ip version:"+v);
        
        }catch( Exception ex){
            System.err.println(ex);

        }
    }
}