import java.util.*;


public class Fibonacciseries {
    static int n1=0,n2=1;
    static int n3=0;
    public static void main(String arg[])
    { 
        System.out.println("input your number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
      
        System.out.print(n1+" "+n2);
        recursive(num);
        //fibonacci code without recursion
        // for(int i=2;i<num;i++)
        // {
        //     n3=n1+n2;
        //     System.out.print(" "+n3);
        //     n1=n2;
        //     n2=n3;

        // }
     
       
       

    
    }
    
    static void recursive(int c)
    { 
        if(c>=0)
        {
            n3=n1+n2;
            n1=n2;n2=n3;
            System.out.print(" "+n3);
            recursive(c-2);
        }
    }
    
}
