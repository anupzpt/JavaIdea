package Max;

public class Main {
    public  static void main(String[] args){
        int[] arr ={6,4,9,2,12,24,-1};
        int max=0;
        int min=0;
        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the max number is:"+max);
        System.out.println("the min number is:"+min);
    }
}
