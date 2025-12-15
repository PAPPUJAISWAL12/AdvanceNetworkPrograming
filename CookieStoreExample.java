import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.*;
public class CookieStoreExample {
    public static void main(String[] args)throws Exception {
       CookieManager cookieManager = new CookieManager();
       CookieHandler.setDefault(cookieManager);
         System.out.println("CookieManager has been set as the default CookieHandler.");
         URL url=new URL("https://www.geeksforgeeks.org/");
            //URLConnection connection=url.openConnection();
            CookieStore cookieStore=cookieManager.getCookieStore();
            url.openConnection().getInputStream().close();
            cookieStore.add(url.toURI(),new HttpCookie(url.getHost(),url.getFile()));
            for(HttpCookie cookie:cookieStore.getCookies()){
                System.out.println("Cookie Name : "+cookie.getName());
                System.out.println("Cookie Value : "+cookie.getValue());
                System.out.println("Domain : "+cookie.getDomain());
            }

    }

}