import java.util.Scanner;
/**
* Computes the decomposition of a positive integer n in prime factors
* Reads n from standard input
*
* @author Samir Gonzalez
* @version 16-Ott-2020
*/
public class PrimeFactorization
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the number");
     int n = scanner.nextInt();

     if (n <= 0) //Less than 0 handler.
     {
      System.out.println("ERROR: PLEASE ENTER A NUMBER GREATER THAN 0");
     }
     else
     {

      String factors = "1";
      int k  =n;
      int j = 2; // multiple counter.
      while (j * j <= k)
      {

        while(k % j == 0) //divides to gather the factors.
        { 

        factors = factors + " * " + j;
        k = k / j; // find the next factor for this new value.
        }
        
        j++;


      }


      if (k > 1)               // if k is greater than 1, then k is a divider
      {
         factors = factors +  " * " + k;
      }



      System.out.println("The following number: " + n + " generates the following factorization pattern " + factors);

     }





   }
}
        
