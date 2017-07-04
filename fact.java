import java.util.*;
class Fact
{
 public static void main(String args[])
 {
  int i,fact=1,number=5; 
  //Scanner in=new Scanner(System.in);
  //int n=in.nextInt();
  for(i=1;i<=number;i++)
  {
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}
