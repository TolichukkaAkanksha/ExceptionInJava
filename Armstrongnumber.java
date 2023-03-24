import java.util.Scanner;
public class Armstrongnumber {
    public static void main(String arg[])
    {
        System.out.println("input your number!");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int k=0,c=0;
        while(num!=0)
        {
            k=num%10;
            c++;
            num=num/10;
            
        }
        System.out.println(c);
        int sum=0;
        int n=0;
        int temp1=temp;
        while(temp!=0)
        {
            n=temp%10;
            sum+=Math.pow(n,c);
            temp=temp/10;

        }
        if(temp1==sum)
        {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}

