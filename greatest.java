import java.util.*;
class greatest
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
int c=in.nextInt();
if(a>b && b>c && c>a)
{
System.out.println("greatest number is:");
}
else
{
System.out.println("false");
}
}
}
