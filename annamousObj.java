class A{
    public A()
    {
        System.out.println("a method");
    }
    public void show()
    {
        System.out.println("this is maethod");
    }
}
public class annamousObj {
    public static void main(String arg[])
    {
        new A().show(); //Annomous obj which have no refference and the obj is nameless
        new A().show();
    }
    
}
