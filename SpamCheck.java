package AdvanceNetwork;
import java.net.*;
public class SpamCheck{
     public static String BlackHole="sbl.spamhaus.org";
    public static void main(String[] args){
       
    System.out.println(IsSpammer(BlackHole));
    // if(IsSpammer(BlackHole)){
    //     System.out.println(BlackHole+"spammer");
    // }else{
    //     System.out.println(BlackHole+"non Spammer");
    // }
    }
    private static boolean IsSpammer(String arg){
       try{
            InetAddress addr=InetAddress.getByName(arg);
        byte[] quad=addr.getAddress();
        String query=BlackHole;
        for(byte octet:quad){
            int ubyte=octet<0?octet+256:octet;
            query=ubyte+"."+query;
        }
        InetAddress.getByName(query);
        return true;
       }catch(Exception ex) {
        ex.printStackTrace();
        return false;
       }

    }
}