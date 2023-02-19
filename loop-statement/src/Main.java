public class Main {
    public static void main(String[] args){
        for(int money= 0; money<100;money++)
        {
            System.out.println("Money Money Money" + money);
        }

       int rupees=1;
        while(rupees<=5){
            System.out.println("Rupeee "+ rupees);
            rupees++;
        }
        int paiso=1;
        do{
            System.out.println("Paiso" +paiso);
            paiso++;
        }while(paiso<=5);

        int[] age={40, 50 ,60};
        for(int element:age){
            System.out.println("Element >>>>" + element);
        }
    }
}