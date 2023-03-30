import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Phonebook implements ActionListener {
    JFrame frame= new JFrame();
    JPanel Panel = new JPanel ();
    JLabel l1 = new JLabel("Info");
    JLabel name = new JLabel("Name: ");
    JLabel city = new JLabel("City: ");
    JLabel phone = new JLabel("Phone: ");
    JButton insert=new JButton("Insert");
    JButton reset =new JButton("Reset");
    JTextField t1=new JTextField();
    JTextField t2=new JTextField();
    JTextField t3=new JTextField();
    JScrollPane scroll=new JScrollPane();
    JTable table=new JTable(3,4);
    Color border =new Color(196, 194, 194);
    Color main =new Color(238, 235, 235);
 void Panel(){


     Panel.setBounds(25,40,370,230);
     Panel.setBackground (main);
     Panel.setBorder (BorderFactory.createLineBorder(border));

     l1.setBounds(40, 25, 25, 30);
     l1.setOpaque(true);
     l1.setBackground(main);

     name.setBounds(60,60,50,30);
     city.setBounds(60,100,50,30);
     phone.setBounds(60,140,50,30);

     t1.setBounds(110,60,200,30);
     t2.setBounds(110,100,200,30);
     t3.setBounds(110,140,200,30);

     insert.setBounds(110,180,90,30);
     insert.addActionListener(this);
     reset.setBounds(210,180,90,30);

     frame.add(name);
     frame.add(city);
     frame.add(phone);

     frame.add(t1);
     frame.add(t2);
     frame.add(t3);

     frame.add(insert);
     frame.add(reset);

     frame.add(l1);
     frame.add(Panel);
 }
 void table()
 {
     table.setBounds(25,300,380,200);
     table.setRowHeight(25);
//     table.setTableHeader();
     table.setBorder(BorderFactory.createLineBorder(border));
     frame.add(table);
 }
 void render(){
     Panel();
     table();
     frame.setSize(450,600);
     frame.setTitle("PhoneBook");
     frame.setLayout(null);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setResizable(false);
     frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String name= t1.getName();
        String city= t2.getName();
    String phone= t3.getName();
        if(e.getSource()==insert){
//         String data[]={t1.getText()};
            System.out.println(t1.getText());
        }
    }
}
