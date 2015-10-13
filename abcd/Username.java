import java.util.Scanner;
public class Username
{
public static void main(String[] args)
{
//Initialise Variables
String FirstName;
String LastName;
String Result;

Scanner input = new Scanner(System.in);

//prompts the user to enter firstname 
System.out.print("Please Enter First Name: ");
FirstName=input.next();

//prompts the user to enter lastname
System.out.print("Please Enter Last Name: ");
LastName=input.next();

//Display Name
System.out.println("Name is:"+FirstName+" "+LastName);

//To generate Random Numbers within 10 to 99
int randomNum = 10 + (int)(Math.random()*99);

//To Add first letter of the user's first name (John), followed by the first five characters
//of the user's last name(Smith), followed by a random number in the range 10 to 99.
Result=FirstName.substring(0,1)+LastName.substring(0,5)+randomNum;

//To display the output.
System.out.println("Output is:"+Result);

}

}

