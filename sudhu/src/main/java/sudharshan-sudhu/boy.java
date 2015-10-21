
public class boy extends human{

	boy(){
		str2= "Child";
	}
	
	public void disp(){
	System.out.println(str1);
	System.out.println(str2);
	}
	
	public static void main (String args[]){
		
		boy b = new boy();
		b.disp();
		
	}
	
}
