package AdvanceNetwork;

import java.io.InputStream;
import java.io.Reader;
import java.net.URL;



public class GetContentClass {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://www.nwu.org");
        Class<?>[] types=new Class[3];
        types[0]=String.class;
        types[1]=Reader.class;
        //types[2]=InputStream.class;
        Object o=url.getContent(types);

        System.out.println("content:"+o.getClass().getName());


        if(o instanceof String){
            System.out.println("string:"+o);
        }else if(o instanceof Reader){
            System.out.println("Reader:"+o);
            Reader r=(Reader) o;
            int c;
            while((c=r.read())!=-1){
                System.out.write(c);
            }
        }else if(o instanceof InputStream){
            System.out.println("InputStream:"+o);
        }else{
            System.out.println("Null");
        }
    }
}
