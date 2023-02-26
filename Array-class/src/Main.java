public class Main {
    public static void main(String[] args) {
        int[] x = new int[3];
        int[] y = {10,20,30};
        int[] arr ={100,2,3,4,5,6,7,8,9,10};

//        for(int number: arr)
//        {
//            System.out.println("Elements are :" + number);
//        }

        int[][] xy={{10,20,30},{30,40,60},{20,30,40}};
        System.out.print("\n\nArray at position 1 is:");
        System.out.println(xy[0][1]);

        System.out.print("\n\n1D array is:");

        for(int i=0 ;i<y.length ;i++)
        {
            System.out.print(y[i] + " ");
        }
        System.out.print("\n\n2D array is:");

        for(int i=0; i<xy.length ;i++)
        {
            for(int j=0; j<xy[i].length ;j++){
                System.out.print( xy[i][j] + " ");
            }
        }
    }
}