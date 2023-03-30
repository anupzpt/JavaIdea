package Swing3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setTitle("Class");

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();

//////////////////////////////////

        JLabel l1=new JLabel("Register Page");
        JLabel l3=new JLabel("Login Page");

        JTextField username =new JTextField(" Enter Username");
        JTextField address =new JTextField(" Enter Username");
        JButton button=new JButton("Login");

        JCheckBox box=new JCheckBox();
        JLabel l2=new JLabel("Remember Me");
        String[] monkey={"King Kong","Badhar","Gorilla"};
        JComboBox comboBox=new JComboBox(monkey);

///////////////////////////
        JTextField name =new JTextField(" Enter Name");
        JTextField password =new JTextField(" Enter Password");
        JButton b=new JButton("Submit");

////////////

        Color myColor =new Color(140, 170, 197);
        Color my=new Color(127, 199, 135);


//////////left box //////

        l1.setBounds(100,15,100,30);
        username.setBounds(50,50,200,40);
        address.setBounds(50,100,200,40);
        comboBox.setBounds(50,150,200,30);
        box.setBounds(50,190,20,30);
        l2.setBounds(80,190,100,30);
        button.setBounds(100,250,100,30);

//////////right box//////
        l3.setBounds(425,15,100,30);

        name.setBounds(350,50,200,40);
        password.setBounds(350,120,200,40);
        b.setBounds(400,200,100,30);

        ////////panel //////////

        p1.setBounds(20,10,270,300);
        p1.setBackground(myColor);

        p2.setBounds(320,10,270,300);
        p2.setBackground(my);

/////////////////////////

        frame.add(l1);
        frame.add(username);
        frame.add(address);
        frame.add(box);
        frame.add(l2);
        frame.add(button);
        frame.add(comboBox);
        frame.add(p1);

        frame.add(l3);
        frame.add(name);
        frame.add(password);
        frame.add(b);
        frame.add(p2);


        frame.setLayout(null);
        frame.setSize(800,500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
