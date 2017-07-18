import java.util.*;
public class sumodd {
	public static void main(String[] args)
	{
	  int sum = 0 ;
	 for(int i = 1 ; i <= 15 ; i++){
	             for(int j = 1 ; j <= i; j++ ){
	                sum = sum + j ;
	             }
	             System.out.println( sum) ;
	             sum = 0 ;
	         }
	   for (int i = 15; i <= 45; i++) 
	      {
	      if (i % 2 != 0) 
	      {
	        sum = sum + i;
	      }
	    }
	    System.out.println("The Sum Of 45 Odd Numbers are:" + sum);
	  }
	}
