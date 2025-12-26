import java.net.*;
import java.util.Date;
//Write a program to read HTTP header information from a URL
public class ReadingHeaderFile{
    public static void main(String[] args)throws Exception {
     URL url=new URL("https://www.tutorialsteacher.com/csharp/csharp-interface");
     URLConnection uc=url.openConnection();
        System.out.println("content Type:"+uc.getContentType());
        if(uc.getContentLength()!=-1){
            System.out.println("Content Lenghth:"+uc.getContentLength());
        }else if(uc.getDate()!=0){
            System.out.println("getDate:"+new Date(uc.getDate()));
        }else if(uc.getExpiration()!=0){
            System.out.println("Expiration:"+new Date(uc.getDate()));
        }else if((uc.getLastModified()!=0)){
            System.out.println(uc.getLastModified());
        }else{
            System.out.println("0");
        }
    }
}