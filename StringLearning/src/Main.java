public class Main {
    public static void main(String[] args) {
        //string only[Immutable]
        ////string pool mah gayara basxa
        String str ="hello";
        ///heap mah store hunxa
        String str2 = new String("Hello");
        System.out.println(str.equals(str2));

        //StringBuffer[mutable]
        StringBuffer name =new StringBuffer("Anu");
        name.append("Prajapati"); //this will modify the stringBuffer
        System.out.println(name);
    }
}