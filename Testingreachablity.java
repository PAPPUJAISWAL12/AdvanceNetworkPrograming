package AdvanceNetwork;
import java.net.InetAddress;

public class Testingreachablity {
    public static void main(String[] args){
        try{
            InetAddress address =InetAddress.getByName("www.google.com");
            if(address.isReachable(300)){
                System.out.println("this mechine is reachable");
            }else{
                System.out.println("this mechine is not reachable");
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }
}
