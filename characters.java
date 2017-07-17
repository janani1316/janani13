import java.util.*;
public class characters 
{
	public static void main(String[] args) 
  {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a string");
		String j=sc.next();
		int count=0;
		for(int i=0;i<j.length();i++)
    {
			count++;
		}
		System.out.println(count);
	}

}
