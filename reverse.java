import java.util.*;

public class reverse {
		 
        public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                int reversedNumber = 0;
                int temp = 0;
               
                while(n > 0){
                        temp = n%10;
                        reversedNumber = reversedNumber * 10 + temp;
                        n = n/10;
                         
                }
              
                System.out.println("Reversed Number is: " + reversedNumber);
        }
}
