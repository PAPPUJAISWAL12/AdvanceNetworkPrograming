import java.net.URI;

public class EqualitandComperisionUri {
    public static void main(String[] args)throws Exception {
        URI uri1=new URI("https://www.google.com/search?q=javatpoint&rlz=1C1RLNS_enNP1150NP1150&oq=javatpoint&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDYwNThqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
        URI uri2 = new URI("https://www.google.com/search?q=javatpoint&rlz=1C1RLNS_enNP1150NP1150&oq=javatpoint&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDYwNThqMGo3qAIIsAIB&sourceid=chrome&ie=UTF-8");
       //Equality
        if(uri1.equals(uri2)){
            System.out.println("same");
        }else{
            System.out.println("Uri not same");
        }
//Comparision
        int result=uri1.compareTo(uri2);
        if(result==0){
            System.out.println("same uri");
        }else{
            System.out.println("not same");
        }
//String Representation
        System.out.println("String:"+uri1.toString());
        System.out.println("AsciiString:"+uri1.toASCIIString());
    }
}
