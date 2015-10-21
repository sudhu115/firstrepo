import java.util.Scanner;
public class Echoplus
{
//-----------------------------------------------------------------
// Reads a character string from the user and prints it.
//-----------------------------------------------------------------
public static void main (String[] args)
{
	String message;
	int miles;
	double gallons, mpg;
	Scanner scan1 = new Scanner (System.in);
	
	System.out.println ("Enter a line of text:");
	message = scan1.nextLine();
	System.out.println ("You entered: \"" + message + "\"");
	
	Scanner scan2 = new Scanner (System.in);
	System.out.print ("Enter the number of miles: ");
	miles = scan2.nextInt();
	System.out.print ("Enter the gallons of fuel used: ");
	gallons = scan2.nextDouble();
	mpg = miles / gallons;
	System.out.println ("Miles Per Gallon: " + mpg);
	}


{



}
}
	
