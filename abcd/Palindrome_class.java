

import java.util.Scanner;

public class Palindrome_class {

    
    public static boolean isPal(String str)
    {
        if(str.length() == 0 || str.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPal(str.substring(1, str.length()-1));

       
        return false;
    }

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or word to check if its a palindrome or not");
        String inputReader = sc.nextLine();
        if(isPal(inputReader))
            System.out.println(inputReader + " is a palindrome number");
        else
            System.out.println(inputReader + " is not a palindrome number");
    }
    
}
