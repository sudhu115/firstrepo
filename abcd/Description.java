
public class Description extends Title
{
	String description;
	String department;
	
	public void getDescription()
	{
		System.out.println("Enter course description");
		description=sc.nextLine();
		System.out.println("Enter Course Department");
		department=sc.next();
	}
	
	public void printCourseDetails()
	{
		System.out.println("Course Title is :"+courseTitle);
		System.out.println("Course Number is :"+courseNumber);
		System.out.println("Course Description is :"+description);
		System.out.println("Course Department is :"+department);
	}

}
