// https://www.youtube.com/watch?v=dfhmTyRTCSQ
// time stamp: 19:42

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    // declaring all the required buttons and variables and the frame
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functiButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    // setting a font for the text/number displayed and setting a font size
    Font myFont = new Font("SansSerif",Font.PLAIN,25);

    double num1=0, num2=0, result=0;
    char operator;

    // default constructor
    Calculator(){
        frame = new JFrame("Calculator");                   // window title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     // self explanatory
        frame.setSize(420, 550);                     // self explanatory
        frame.setLayout(null);                            // no layout set as of now

        textField = new JTextField();                             // creates a field/textbox that we can type in
        textField.setBounds(50, 25, 300, 50);    // size of the text field
        textField.setFont(myFont);                                // self explanatory
        textField.setEditable(false);                           // makes it unable to edit the text field

        addButton = new JButton("+");                        // defining all the buttons
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        functiButtons[0] = addButton;                             // adding all the buttons to the function buttons array
        functiButtons[1] = subButton;
        functiButtons[2] = mulButton;
        functiButtons[3] = divButton;
        functiButtons[4] = decButton;
        functiButtons[5] = equButton;
        functiButtons[6] = delButton;
        functiButtons[7] = clrButton;

        for(int i=0; i<8; i++) {
            functiButtons[i].addActionListener(this);
            functiButtons[i].setFont(myFont);
            functiButtons[i].setFocusable(false);       // when we click a button ther is a "focus" or outline displays on the text, that is getting diabled
        }
        for (int i=0; i<10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);       // when we click a button ther is a "focus" or outline displays on the text, that is getting diabled
        }

        delButton.setBounds(50, 430, 145, 50);   // x and y are with reference of top left corner
        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.GRAY);
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);
        
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator clac = new Calculator();

    }

    @Override
    public void actionPerformed(ActionEvent e){

    }
}