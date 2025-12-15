package AdvanceNetwork;

import java.net.URL;

public class TestRelative {
    public static void main(String[] args)throws Exception {
        URL myurl =new URL("https://www.w3schools.com/");
        URL asppage1=new URL(myurl,"css/default.asp");
        URL aspPage2=new URL(myurl,"js/default.asp");
        System.out.println(asppage1);
        System.out.println(aspPage2);
    }
}
