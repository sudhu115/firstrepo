import java.util.Scanner;
public class userInput {
    
	public static void main(String args[])
	{
		  String str;
		  int i;
		  float f;
		  double d;
		  Scanner scan = new Scanner(System.in);
		
		  System.out.println("Enter input string");
		  str = scan.nextLine();
		  System.out.println("Entered input string is  "+str);
		  
		  System.out.println("Enter input integer");
		  i = scan.nextInt();
		  System.out.println("Entered input integer is " +i);
		  
		  System.out.println("Enter input float value");
		  f= scan.nextFloat();
		  System.out.println("Entered input float value is " +f);
		  
		  System.out.println("Enter input double value");
		  d= scan.nextDouble();
		  System.out.println("Entered input double value is "+d);
		  
	}
}
