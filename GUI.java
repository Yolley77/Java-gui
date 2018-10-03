package practice4;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {
    
    JTextField jtf = new JTextField(10);
    JTextField jtf2 = new JTextField(10);
    JButton button = new JButton("hey, dude");
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    
    GUI() {
        super("джавагуй");
        setLayout(new FlowLayout());
        setSize(250, 250);
        add(new JLabel("FIRST"));
        add(jtf);
        jtf.setForeground(Color.YELLOW);
        jtf.setFont(fnt);
        add(new JLabel("SECOND"));
        add(jtf2);
        
        add(button);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    
}
