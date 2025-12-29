import java.net.*;

public class Find1024port {
    public static void main(String[] args) {
        try{
            String host="";
        if(args.length>0)
        { 
            host=args[0];
        }
        else{ 
            host="localhost";
        }
        for(int i=1;i<=1024;i++){
            Socket s=new Socket(host,5000);
            try{
                System.out.println("socket:"+s);
                System.out.println("host:"+host);
                System.out.println("port"+i+"is open");
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }}catch(Exception e){
            e.printStackTrace();
        }
    }
}
