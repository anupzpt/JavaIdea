import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame=new JFrame();
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JLabel l1=new JLabel("Enter number 1");
    JLabel l2=new JLabel("Enter number 2");
    JLabel l3=new JLabel("Sum of number is:");


    JButton button =new JButton("Add");
    JButton btn2 =new JButton("Sub");

    void renderform(){
        l1.setBounds(5,10,100,20);
        frame.add(l1);
        t1.setBounds(10,50,100,30);
        frame.add(t1);
        l2.setBounds(5,100,100,20);
        frame.add(l2);
        t2.setBounds(10,150,100,30);
        frame.add(t2);
        l3.setBounds(5,190,100,20);
        frame.add(l3);
        t3.setBounds(10,220,100,30);
        frame.add(t3);
    }
    void button(){
        button.setBounds(10, 260,100,40);
        button.addActionListener(this);
        frame.add(button);
        btn2.setBounds(10, 290,100,40);
        btn2.addActionListener(this);
        frame.add(btn2);
    }
    void render(){
        renderform();
        button();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setTitle("Find sum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
//        t1.setText("Anu");
//        System.out.println(t1.getText());
        int num1= Integer.parseInt(t1.getText());
        int num2= Integer.parseInt(t2.getText());
        if(e.getSource()==button){
            int sum=num1+num2;
            t3.setText(String.valueOf(sum));
        }
        if(e.getSource()==btn2){
            int diff=num1-num2;
            t3.setText(String.valueOf(diff));

        }

    }
}
