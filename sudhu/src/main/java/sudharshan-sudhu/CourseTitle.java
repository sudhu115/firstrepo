
import java.util.Scanner;

public class CourseTitle
{
	String courseTitle;
	String courseNumber;
	
	Scanner sc=new Scanner(System.in);
	
	public void getTitle()
	{
		System.out.println("Enter titile of the course ");
		courseTitle=sc.nextLine();
		System.out.println("Enter Course ID");
		courseNumber=sc.nextLine();
		
		
	}
	

}
