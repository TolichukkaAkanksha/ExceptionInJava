class A{
    public A()
    { super();
        System.out.println("this a constructor");
    }

    public A(int m)
    {   this();
        System.out.println("this parametreized constructor");
    }
}
class B extends A{
    public B()
    { super(5);
        System.out.println("this is b constructor");
    }
    public B(int n)
    {   this();
       
        System.out.println("this is parameterized constructor");
     
    }
}
public class ThisSupper {
    public static void main(String arg[])
    {
        B obj=new B(4);
    }
}
