package practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    
    JTextField jtf = new JTextField(10);
    JTextField jtf2 = new JTextField(10);
    JTextArea jta1 = new JTextArea(10,15);
    JScrollPane scroll = new JScrollPane(jta1);
    JButton button = new JButton("Add text");
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    
    JPanel[] panel = new JPanel[14];
    
    GUI() {
        super("джавагуй");
        setLayout(new FlowLayout());
        setSize(250, 350);
        add(new JLabel("FIRST"));
        add(jtf);
        jtf.setForeground(Color.YELLOW);
        jtf.setFont(fnt);
        add(new JLabel("SECOND"));
        add(jtf2);
        add(jta1);
        add(scroll);
        
        add(button);
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                jta1.append(txt);
            }
        });
        
        
        setLayout(new GridLayout(3,4));
        for(int i = 0 ; i < panel.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            panel[i] = new JPanel();
            panel[i].setBackground(new Color(r,g,b));
            add(panel[i]);
        }
        panel[4].setLayout(new BorderLayout());
        panel[4].add(new JButton("one"),BorderLayout.WEST);
        panel[4].add(new JButton("two"),BorderLayout.EAST);
        panel[4].add(new JButton("three"),BorderLayout.SOUTH);
        panel[4].add(new JButton("four"),BorderLayout.NORTH);
        panel[4].add(new JButton("five"),BorderLayout.CENTER);
        panel[10].setLayout(new FlowLayout());
        panel[10].add(new JButton("one"));
        panel[10].add(new JButton("two"));
        panel[10].add(new JButton("three"));
        panel[10].add(new JButton("four"));
        panel[10].add(new JButton("fve"));
        setSize(800,500);
        
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GUI();
    }
    
}
