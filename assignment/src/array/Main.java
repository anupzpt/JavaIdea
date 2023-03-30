package array;

public class Main {
    public static void main(String[] args){
        int[] num={5,10,15,20};
        int i=0;
        int sum=0;
        System.out.println("The list of array you for sum:");

        while(i<4)
        {
            System.out.print(num[i] + ",");
             sum = num[i] + sum;
             i++;
        }
        System.out.println(" ");
        System.out.println("the sum of array is "+sum);
    }
}
