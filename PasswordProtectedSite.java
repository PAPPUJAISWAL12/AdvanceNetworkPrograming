import java.net.*;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;

import java.awt.*;
import java.io.*;

public class PasswordProtectedSite {
    public static void main(String[] args) {
        Authenticator.setDefault(new DialogAuthenticator());
        try{
            URL url = new URL("https://httpbin.org/basic-auth/user/passwd");
            URLConnection connection = url.openConnection();
            connection.connect();
            BufferedReader brd=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line=brd.readLine())!= null) {
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
class DialogAuthenticator extends Authenticator{
     JTextField username=new JTextField();
     JPasswordField password=new JPasswordField();
     private PasswordAuthentication authentication;
     JFrame frame=new JFrame();
        JDialog dialog=new JDialog(frame,"Authentication Required",true);
     public DialogAuthenticator(){
        
        Container container=dialog.getContentPane();
        container.setLayout(new GridLayout(3,2));

        
        JLabel lbluserName=new JLabel("Username:");
        container.add(lbluserName);
        container.add(username);
        JLabel lblpassword=new JLabel("Password:");
        container.add(lblpassword);
        container.add(password);

        JButton Cancel=new JButton("Cancel");
        container.add(Cancel);
        Cancel.addActionListener(e->{
            authentication=null;
            dialog.setVisible(false);
        });
        JButton login=new JButton("Login");
        container.add(login);
        login.addActionListener(e->{
            authentication=new PasswordAuthentication(username.getText(),password.getPassword());
            dialog.setVisible(false);
        });
                dialog.pack();

     }
     @Override 
     protected PasswordAuthentication getPasswordAuthentication(){
        dialog.setVisible(true);
         return authentication;
     }

}