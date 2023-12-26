// https://www.youtube.com/watch?v=dfhmTyRTCSQ - REFERENCE
// -----------------------------------------------------------------------------------

/* This is a simple code for making a calculator app from java swing library
 * By: Ritvik Bhatnagar
 */

// -----------------------------------------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    // declaring all the required buttons and variables and the frame
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functiButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
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
        delButton = new JButton("Del");
        clrButton = new JButton("Clear");
        negButton = new JButton("(-)");

        functiButtons[0] = addButton;                             // adding all the buttons to the function buttons array
        functiButtons[1] = subButton;
        functiButtons[2] = mulButton;
        functiButtons[3] = divButton;
        functiButtons[4] = decButton;
        functiButtons[5] = equButton;
        functiButtons[6] = delButton;
        functiButtons[7] = clrButton;
        functiButtons[8] = negButton;

        for(int i=0; i<9; i++) {
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

        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);   // x and y are with reference of top left corner
        clrButton.setBounds(250, 430, 100, 50);


        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4,4,10,10));
        //panel.setBackground(Color.GRAY);  -- shows the panel

        // adding the buttons to the panel
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

        // adding different elements to the frame
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        for(int i=0; i<10; i++) {
            if(e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if(e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }

        if(e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());           // retreving the number 1
            operator = '+';
            textField.setText("");
        }

        if(e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }

        if(e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = 'x';
            textField.setText("");
        }

        if(e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }

        if(e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());
            switch(operator) {
                case '+':
                result = num1+num2;
                break;
                case '-':
                result = num1-num2;
                break;
                case 'x':
                result = num1*num2;
                break;
                case '/':
                result = num1/num2;
                break;
            }
            textField.setText(String.valueOf(result));
            num1=result;
        }

        if(e.getSource() == clrButton) {
            textField.setText("");
        }

        if(e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            for(int i=0; i<string.length()-1; i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }

        if(e.getSource() == negButton) {
            double temp = Double.parseDouble(textField.getText()); // takes value from textfield and assign it to temp variable
            temp*=-1;
            textField.setText(String.valueOf(temp));
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}