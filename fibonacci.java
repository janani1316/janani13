import java.util.*;
class fibonacci
{
	public static void main(String[] args) 
	{
	int i,n, first=0, second=1, fib;
	Scanner j=new Scanner(System.in);
	n=j.nextInt();
	first=0;
	second=1;
	System.out.println("Fibonacci series are: ");
	 for(i=0; i<n; i++)
	 {
	  System.out.println(first);
	  fib = first + second;
	  first = second;
	  second = fib;
	  }
	}
}
