import java.util.Scanner;
/**
* Computes the decomposition of a positive integer n in prime factors
* Reads n from standard input
*
* @author Samir Gonzalez
* @version 16-Ott-2020
*/
public class Reverse
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter the phrase");
     String word = scanner.next();

     
     String[] temp = new String[20];

     int i = 0;

     while(i< word.length()){
      System.out.println(word.charAt(i)+ " ");   
      temp[i] = word.charAt(i)+ " ";    
      i++;
     }

     int j = i - 1;
    
     while(j>=0)
     {
      System.out.println(" " +temp[j]);
      j = j - 1;
     }



   }
}
        
