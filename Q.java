import java.util.*;

public class Q {
	    public static void main(String[ ] args)
	    {
	      Scanner in = new Scanner(System.in);
	      System.out.println("Enter some strings !");
	      List<String> list = new ArrayList<String>( );
	      boolean loop = true;
	        while(loop)
	        {
	          String s = in.nextLine( );
	 
	            if(s.equals("")|s.equals("q"))
	            {
	              break;    
	            }
	            else
	            {
	              list.add(s);
	            }
	        }
	       
	    }
	 
	}
