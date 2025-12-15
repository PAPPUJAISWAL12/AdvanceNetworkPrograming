
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingandDecodingURL {
    public static void main(String[] args)throws Exception {
        String text="Hello@Aayush";
        String encode=URLEncoder.encode(text,"UTF-8");
        System.out.println("Encode Text:"+encode);
        System.out.println("decode Text:"+URLDecoder.decode(encode,"UTF-8"));
        String nischal="Hello#_Nischal";
        String encodeNischal=URLEncoder.encode(nischal, "Utf-8");
        System.out.println("encode Text:"+encodeNischal);
        System.out.println("Decode Text:"+URLDecoder.decode(encodeNischal,"UTF-8"));
    }
}
