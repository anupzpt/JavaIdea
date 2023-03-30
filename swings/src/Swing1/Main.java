package Swing1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       JFrame frame =new JFrame("hello world");
        frame.setSize(400,400);
        //layout manager
        frame.setLayout(null);
        frame.setVisible(true);

       //button add garna
        JButton button =new JButton("click me");
        button.setBounds(200,100,100,50 );
        frame.add(button);

        JLabel jlabel =new JLabel("label");
        jlabel.setBounds(100,10,100,100);
        frame.add(jlabel);



    }
}