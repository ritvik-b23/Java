import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TimeTable extends JFrame implements ActionListener{
    
    JFrame frame;
    
    
   
    TimeTable() {
        frame = new JFrame("Time Table");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 700);
        frame.setResizable(false);
        
        
    }

    public static void main(String[] args) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}