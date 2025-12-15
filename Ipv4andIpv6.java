package AdvanceNetwork;
import java.net.*;
public class Ipv4andIpv6 {
    public static void main(String[] args) {
       try{
         InetAddress addr=InetAddress.getByName("ff05:0:0:0:0:0:0:101");
            if(addr instanceof Inet4Address){
                System.out.println("this is a Inet4Address");
                
            }

            if(addr instanceof Inet6Address){
                System.out.println("This is a Inet6Address");
                Inet6Address ipv6=(Inet6Address)addr;
                if(ipv6.isIPv4CompatibleAddress()){
                    System.out.println("this address is compatible for ipv4");
                }else{
                    System.out.println("This address in not compatible for ipv4");
                }
            }
       }catch(Exception ex){
        ex.printStackTrace();
       }

    }
}