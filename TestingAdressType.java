package AdvanceNetwork;
import java.net.InetAddress;

public class TestingAdressType {
    public static void main(String[] args) {
        try{
            InetAddress address=InetAddress.getByName("ff05:0:0:0:0:0:0:101");
            if(address.isAnyLocalAddress()){
                System.out.println(address+"is a wildcard adress");
            }else if(address.isLinkLocalAddress()){
                System.out.println(address+"is a Link Local address");
            }else if(address.isLoopbackAddress()){
                System.out.println(address+"loop back address");

            }else if(address.isSiteLocalAddress()){
                System.out.println(address+"is a site local address");
            }else if(address.isMulticastAddress()){
                if(address.isMCGlobal()){
                    System.out.println(address+"mc global address");
                }else if(address.isMCSiteLocal()){
                    System.out.println(address+"is a mc Site local address");
                }else if(address.isMCLinkLocal()){
                    System.out.println(address+"is a Mc link local address");
                }else if(address.isMCOrgLocal()){
                    System.out.println(address+"mc org local address");
                }else{
                    System.out.println(address+"mc node local address");
                }
            }else{
                System.out.println(address+ "is a unicast address");
            }

        }catch(Exception ex){
            System.err.println(ex+ "provided ip address doesn't exist.");
        }
    }
}