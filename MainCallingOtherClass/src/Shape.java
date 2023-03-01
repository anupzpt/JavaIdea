public class Shape {
    int width ;
    int height;
    //Default constructor
//    Shape(){
//        width=10;
//        height=20;
//    }
    Shape(int w, int h){
        width =w;
        height=h;
    }
    public void area(){
        System.out.println("I give accurate area");
        System.out.println("The area of recatngle is :" + (width * height) + "cm");
    }


}
