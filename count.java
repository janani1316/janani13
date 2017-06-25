import java.util.*;
class digit
{
    public static void main(String args[])
    {
        Scanner get=new Scanner(System.in);
        int n=get.nextInt();
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
