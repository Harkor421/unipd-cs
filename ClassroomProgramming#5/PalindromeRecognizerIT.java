import java.util.Scanner;
/**
* Computes the decomposition of a positive integer n in prime factors
* Reads n from standard input
*
* @author Samir Gonzalez
* @version 16-Ott-2020
*/
public class PalindromeRecognizerIT
{
   public static void main(String[] args)
   {
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the phrase");
    String word = scanner.next();
    scanner.close();


    boolean xd = false;
    boolean ispalin = false;
    int start = 0;
    int end = word.length() - 1;

    while (xd == false)
    {

        if (word.length() > 2){
          if(start != end){
            if(word.charAt(start) == word.charAt(end))
            {
              start = start + 1;
              end = end - 1; 
            }
            else
            {
              xd = true;
            }
          }
          else
          {
            ispalin = true;
            xd=true;
          }
        }
        else
        {
          ispalin = true;
          xd = true;
        }
       
    }
    System.out.println(ispalin);
   }
}
        
