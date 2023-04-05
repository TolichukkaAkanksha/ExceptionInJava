public class Multiplecatchblocks {
    public static void main(String arg[])
    {
        int i=5,j=6;
        int[] num=new int[4];
        String str=null;
        try{
            j=j/i;
            System.out.println(num[5]);
            System.out.println(str.length());


        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException: / by 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException: of length 5");
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointerException:str = null");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(j);
    }
    
}
