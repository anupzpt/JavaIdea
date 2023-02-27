import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        int[] age ={10,20,30};
        System.out.println(age);

        Vector age3= new Vector();
        age3.add(10);
        age3.add(20);
        age3.add(30);
        age3.add(40);
        System.out.println(age3);

        Vector<Integer> age2= new Vector<>(5);
        age2.add(10);
        age2.add(40);
        age2.add(60);
        age2.add(80);
        age2.add(80);
        age2.add(80);

        System.out.println(age2);
        //for capacity
        System.out.println(age2.capacity());

    }
}