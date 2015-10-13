
import java.util.Scanner;

public class Title
{
	String courseTitle;
	String courseNumber;
	
	Scanner sc=new Scanner(System.in);
	
	public void getTitle()
	{
		System.out.println("Enter Course Title");
		courseTitle=sc.nextLine();
		System.out.println("Enter Course Number");
		courseNumber=sc.nextLine();
		
		
	}
	

}
