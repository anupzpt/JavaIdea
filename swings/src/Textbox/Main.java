package Textbox;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame =new JFrame();
        frame.setSize(400,400);
        frame.setTitle("Textbox");
        frame.setVisible(true);

        frame.setLayout(new FlowLayout());

        JLabel label=new JLabel("username:");
        frame.add(label);

        JTextField t1= new JTextField(20);
        frame.add(t1);
        JLabel label1=new JLabel("password:");
        frame.add(label1);

        JTextField t2= new JTextField(20);
        frame.add(t2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
