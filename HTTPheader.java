import java.net.*;
public class HTTPheader {
    public static void main(String[] args)throws Exception {
        URL url=new URL("https://namunacollege.edu.np/");
        URLConnection con=url.openConnection();
        System.out.println("line:"+con.getHeaderField(0));
        for(int i=1; ;i++){
            String value=con.getHeaderField(i);
            if(value==null)break;
            System.out.println(con.getHeaderFieldKey(i)+" : "+value);

        }
    }
}
