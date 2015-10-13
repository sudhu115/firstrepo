/*
*Palandrome is reverse of number should be example Reer
 */

import java.util.Scanner;

public class Recursion {

    
    public static boolean isPal(String str)
    {
        if(str.length() == 0 || str.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPal(str.substring(1, str.length()-1));

        // if its not the case than string is not.
        return false;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter to check if its a palindrome or not");
        String inputReader = sc.nextLine();
        if(isPal(inputReader))
            System.out.println(inputReader + " is a palindrome number");
        else
            System.out.println(inputReader + " is not a palindrome number");
    }
    
}
