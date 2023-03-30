package prime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner scannerObj =new Scanner(System.in);
        int prime =scannerObj.nextInt();
        int count=0;
       for(int i= 1; i<=prime ;i++)
       {
           if(prime%i ==0){
               count++;
           }

       }
        if(count ==2) {
            System.out.println(+prime + " Is Prime");
        }
           else
            {
                System.out.println(prime +" Is Not prime");
            }

    }
}
