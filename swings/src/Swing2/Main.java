package Swing2;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame f = new JFrame("Swing2");
        f.setTitle("Hello world");
        f.setSize(400,400); //frame ko size fix

        //add custom color
        Color myColor =new Color(236, 173, 139);
        Color myColor2 =new Color(203, 75, 123);
        /////

        JButton B =new JButton("click me");
        B.setBounds(150,150,100,40);
        B.setBackground(myColor2);
        B.setForeground(myColor);
        f.add(B);

        f.getContentPane().setBackground(Color.PINK);
        f.setResizable(false); //resize gana dinna
        f.setLayout(null);
        f.setVisible(true);//frame lai visible garxa

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the frame

    }
}
