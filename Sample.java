public class Sample {
    public static void main(String[] arg)
    {
        int i=0;
        int j=4;
        try{
            j=j/i;
        }
        catch(Exception e)
        {
            System.out.println("divided by zero exception"+e);
        }
        System.out.println(j);
    } 
    
}
