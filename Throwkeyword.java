public class Throwkeyword {
    public static void main(String arg[])
    {
        int i=10,j=90;
        try{
            j=i/j;
            if(j==0)
            {
                throw new ArithmeticException("by default "+i);
            }

        }
        catch(ArithmeticException e)
        {
            j=i;
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(j);
    }
    
}
