package AdvanceNetwork;
import java.net.*;
import java.util.Enumeration;

public class NetworkInterfaceGetbyname {
    public static void main(String[] args) throws Exception {
        // NetworkInterface ni=NetworkInterface.getByName("eth0");
        // if(ni==null){
        //     System.out.println(ni);
        // }else{
        //     System.out.println(ni);
        // }
/*InetAddress address=InetAddress.getLocalHost();
      NetworkInterface nt=NetworkInterface.getByInetAddress(address);
      if(nt==null){
        System.err.println("null");
      }else{
        System.out.println(nt);
      }*/
      Enumeration<NetworkInterface> em=NetworkInterface.getNetworkInterfaces();
      while(em.hasMoreElements()){
        NetworkInterface ni=em.nextElement();
        System.out.println(ni);
      }

     
    }
}
