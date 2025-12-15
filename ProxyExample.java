package AdvanceNetwork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
public class ProxyExample {

    public static class localProxyServer extends ProxySelector{
        public final String proxyHost;
        public final int proxyPort;
        public final List<URI> failedList=new ArrayList<URI>();
        public localProxyServer(String host, int port){
            this.proxyHost=host;
            this.proxyPort=port;
        }
        List<Proxy> proxies=new ArrayList<Proxy>();
      @Override
        public List<Proxy> select(URI uri){
            if(uri==null){
                throw new IllegalArgumentException("URI can't be null");
            }
            if(proxyHost==null||proxyHost.isEmpty()){
                return Collections.singletonList(Proxy.NO_PROXY);                
            }
            SocketAddress address=new InetSocketAddress("192.168.137.1",proxyPort);
            Proxy proxy=new Proxy(Proxy.Type.HTTP,address);
            proxies.add(proxy);
            return proxies;
        }
      @Override
        public void connectFailed(URI uri,SocketAddress sa,IOException ioe){
           if(sa!=null){
             synchronized(failedList){
                if(failedList.contains(uri)){
                    failedList.add(uri);
                proxies.add(Proxy.NO_PROXY );
                }
             }
           }
        }
    }
            
    public static void main(String[] args) {
        String proxyHost="";
        int proxyPort=0;
        if(args.length>=2){
           try{
             proxyPort=Integer.parseInt(args[1]);
           }catch(Exception ex){
            System.err.println(ex.getMessage());
            proxyHost=null;
           }
        }

        localProxyServer proxyServer=new localProxyServer(proxyHost,proxyPort);
        ProxySelector.setDefault(proxyServer);
        try{
            URL url=new URL("https://www.tutorialsteacher.com/csharp/csharp-interface");
            URLConnection urlConn=url.openConnection();
            urlConn.connect();
            urlConn.setConnectTimeout(1000000);
            urlConn.setReadTimeout(1000000);
            try(BufferedReader rd=new BufferedReader(new InputStreamReader(urlConn.getInputStream()))){
                System.out.println(rd.readLine());
            }
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }

    }
}

