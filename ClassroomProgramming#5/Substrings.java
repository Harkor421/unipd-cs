import java.util.Scanner;
/**
* Computes the decomposition of a positive integer n in prime factors
* Reads n from standard input
*
* @author Samir Gonzalez
* @version 16-Ott-2020
*/
public class Substrings
{
   public static void main(String[] args)
   {
     
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the phrase");
    String word = scanner.next();
    scanner.close();
    int count = 0;
    String arr[] = new String[300];

    for(int i = 0; i < word.length(); i++){ //Loops through the word.
        System.out.println("Letter: " + word.charAt(i));
        for(int j = word.length(); j > i; j--){
            String temp = word.substring(i, j);
            arr[count] = "" + temp;
            count = count + 1;
            System.out.println(temp);
        }
    }

    for(int k = 0; k<count; k++){
        System.out.println(arr[k]);
    }

   }

}
        
