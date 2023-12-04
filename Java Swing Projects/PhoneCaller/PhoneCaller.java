import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class PhoneCaller extends JFrame implements ActionListener{
    JFrame frame;
    JTextField textField;
    JPanel panel;
    JButton[] numberButtons = new JButton[10];
    JButton callButton, clrButton;

    PhoneCaller() {
        frame = new JFrame("Phone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,500);
        frame.setLayout(null);
        frame.setResizable(false);


        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFocusable(false);
        }
        callButton = new JButton("Call"); callButton.addActionListener(this);
        clrButton = new JButton("Clear"); clrButton.addActionListener(this);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,5,5));

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(callButton);

        frame.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String call = "Call";
        String end = "End";

        for(int i=0; i<10; i++) {
            if(e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == callButton) {
            if (callButton.getText().equals(call)) {
                callButton.setText(end);
            }

            else {
                callButton.setText(call);
                textField.setText("");
            }
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        PhoneCaller run = new PhoneCaller();
    }
}