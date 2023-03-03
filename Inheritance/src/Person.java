public class Person {
    String name="Anu";
    public int age;
    Person()
    {
        age=16;
    }
    Person(int a)
    {
        age=a;
    }
    public void introduce()
    {
        System.out.println("My name is "+ name + " . I am " + age + "years old.");
    }
}
