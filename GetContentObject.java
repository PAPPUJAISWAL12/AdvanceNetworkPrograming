package AdvanceNetwork;

import java.net.URL;

public class GetContentObject {
    public static void main(String[] args) throws Exception {
        URL url =new URL("https://www.w3schools.com/");
        Object o=url.getContent();

        // System.out.println("CanonicalName:"+o.getClass().getCanonicalName());
        // System.out.println("Name:"+o.getClass().getSimpleName());
        System.out.println("Name:"+o.getClass().getName());
        System.out.println(o.getClass().getClassLoader());
    }
}
