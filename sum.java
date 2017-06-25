import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=6,sum=0;
        
        for(int i=1;i<n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of numbers are:"+sum);
    }
}
