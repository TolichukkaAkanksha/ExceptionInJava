public class ownexception {
    public static void main(String arg[])
    {
        int i=10,j=90;
        try{
            j=i/j;
            if(j==0)
            {
                throw new MyException("by default MyException");
            }

        }
        catch(ArithmeticException e)
        {
            j=i;
           
        }
        catch(MyException e)
        { j=i;
            System.out.println("myexception is own exception");
        }
        System.out.println(j);
    }
   
    
}
class MyException extends RuntimeException{
    public MyException(String str)
    {
        super(str);
    }
        }
