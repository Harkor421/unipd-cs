import java.util.Scanner;
/**
* Computes the decomposition of a positive integer n in prime factors
* Reads n from standard input
*
* @author Samir Gonzalez
* @version 16-Ott-2020
*/
public class PalindromeRecognizerRecursion
{
   public static void main(String[] args)
   {
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the phrase");
    String word = scanner.next();
    scanner.close();

    boolean palin = isPalindromeREC(word);

    System.out.println(palin);

   }

   public static boolean isPalindromeREC(String s)
   {
      // preconditions
      if (s == null)
      {
         throw new IllegalArgumentException();
      }
                  
      // base case 1: string is empty or has a single character
      if (s.length() < 2) 
      {
         return true;
      }
         
      // base case 2: // first and last char differ
      char c1 = s.charAt(0);               // first char in the string
      char c2 = s.charAt(s.length() - 1);  // last char in the string
      
      if (c1 != c2)                // note c1 and c2 are of a primitve data type
      {                            // and therefore we can compare them using !=
         return false;
      } 

      // recursive step - tail recursion         
      return isPalindromeREC(s.substring(1, s.length() - 1));        
   }
}
        
