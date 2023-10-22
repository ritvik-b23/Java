// https://www.youtube.com/watch?v=Hiv3gwJC5kw
// time stamp: 13:11
// -----------------------------------------------------------------------------------

/* This is a simple code for making a Login System from java swing library
 * By: Ritvik Bhatnagar
 */

// -----------------------------------------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class IDandPasswords {
    // creating a hashmap 
    HashMap<String, String> logininfo = new HashMap<>();        // stores User id and passwords;
    IDandPasswords() {
        logininfo.put("usr1", "pass1");
        logininfo.put("usr2", "pass2");
        logininfo.put("usr3", "pass3");
    }

    protected HashMap<String, String> getLoginInfo() {
        return logininfo;
    }
}

class LoginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Passowrd");
    JLabel messageLabel = new JLabel();


    HashMap<String, String> logininfo = new HashMap<>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        logininfo = loginInfoOriginal;                          // copy of our hashmap

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

class WelcomePage {

}

public class LoginSystem {
    public static void main(String[] args) {
        IDandPasswords idandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}