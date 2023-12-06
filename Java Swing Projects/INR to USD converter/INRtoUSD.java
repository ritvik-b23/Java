import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;

public class INRtoUSD extends JFrame implements ActionListener {
    JFrame frame;
    JTextField textFieldINR, textFieldUSD;
    JTextArea text;
    JButton inrButton, usdButton, closeButton;
    JLabel labelINR, labelUSD;

    INRtoUSD() {
        frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);

        labelINR = new JLabel("INR:");
        labelINR.setBounds(30, 15, 50, 20);
        textFieldINR = new JTextField("");
        textFieldINR.setEditable(true);
        textFieldINR.setBounds(70,10,50,30);
        inrButton = new JButton("INR");
        inrButton.setBounds(40, 60, 70, 30);
        inrButton.addActionListener(this);

        labelUSD = new JLabel("USD:");
        labelUSD.setBounds(200, 15, 50, 20);
        textFieldUSD = new JTextField("");
        textFieldUSD.setEditable(true);
        textFieldUSD.setBounds(250,10,50,30);
        usdButton = new JButton("USD");
        usdButton.setBounds(220, 60, 70, 30);
        usdButton.addActionListener(this);

        closeButton = new JButton("Close");
        closeButton.setBounds(140,170,80,30);
        closeButton.addActionListener(this);

        frame.add(labelINR);
        frame.add(labelUSD);
        frame.add(textFieldINR);
        frame.add(textFieldUSD);
        frame.add(inrButton);
        frame.add(usdButton);
        frame.add(closeButton);
        frame.pack();
        frame.setSize(400,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double inr, usd;
        DecimalFormat df = new DecimalFormat("#0.000");
        final double usd_to_inr = 83.3;

        if (e.getSource() == inrButton) {
            inr = Double.parseDouble(textFieldINR.getText());
            usd = inr/usd_to_inr;
            textFieldUSD.setText(String.valueOf(df.format(usd)));
        }

        if (e.getSource() == usdButton) {
            usd = Double.parseDouble(textFieldUSD.getText());
            inr = usd*usd_to_inr;
            textFieldINR.setText(String.valueOf(df.format(inr)));
        }

        if (e.getSource() == closeButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        INRtoUSD run = new INRtoUSD();
    }
}
