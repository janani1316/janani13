import java.util.Scanner;

public class prime 
{
	    public static void main(String[] args)
	    {
	         Scanner in=new Scanner(System.in);
	         int a,b,flag,temp;
	        System.out.println("Enter the two numbers");
	        a=in.nextInt();
	        b=in.nextInt();
	      
	        if(a>b)
	        {
	            temp=a;
	            a=b;
	            b=temp;
	        }
	        System.out.println("prime numbers b/w two intervals"+a+" "+b);
	        while(a<b)
	        {
	            flag=0;
	            for(int i=2;i<=a/2;i++)
	            {
	                if(a%i==0)
	                {
	                    flag=1;
	                    break;
	                }
	            }
	            if(flag==0)
	            {
	                System.out.println("\t"+a);
	                a++;
	            }
	        }

	    }
	}
