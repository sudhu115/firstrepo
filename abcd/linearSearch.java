import java.util.Scanner;
public class linearSearch {
public static void main(String args[])
{
	int element = 5;
	int[] arr = new int[5];
	Scanner scan = new Scanner(System.in);
	
	for (int i=0;i<5;i++){
		arr[i]=scan.nextInt();
	}
		
	for (int j = 0; j<arr.length;j++)

		{
		if (arr[j] == element )		
		{
			System.out.println("Element is found in the aary" + j );
		 break;
		}
		
}

 } 
}
