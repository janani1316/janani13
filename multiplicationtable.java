    import java.util.io;

    public class multiplicationtable 
    {
      public static void main(String[] args)
        {
            Scanner in= new Scanner(System.in);
          	System.out.print("Enter number:");        
    	      int n=in.nextInt();
            for(int i=1; i <= 10; i++)
            {
             System.out.println(n+" * "+i+" = "+n*i);
            } 
         }

    }
