import java.util.*;
public class arm {
	public static void main(String args[])
	{
		int a, b, i, num, digit, sum;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the 2 numbers");
	a=in.nextInt();
	b=in.nextInt();
	System.out.println("Armstrong numbers between an are:");
	for(i = a; i <= b; i++)
	  {
	        sum = 0;
	        num = i;

	        for(; num > 0; num /= 10)
	        {
	            digit = num % 10;
	            sum = sum + digit * digit * digit;
	        }

	        if(sum == i)
	        {
	            System.out.println(i);
	        }
	  }
	}
}
