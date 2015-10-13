import java.util.*;
public class ArrList {
public static void main (String args[]){
	ArrayList<String > arr = new ArrayList<String>();
	
	arr.add("siva");
	arr.add("krishna");
	arr.add("thumati");
	
	System.out.println("Values in arrays are " + arr);
	
	arr.add(0,"chowdary");
	System.out.println("Values in arrays are " + arr);
	boolean b = arr.contains("chowdary");
	
	System.out.println(b);
	
	
	arr.remove("siva");
	System.out.println("Values in arrays are " + arr);
	
	arr.remove(1);
	System.out.println("Values in arrays are " + arr);
	arr.clear();
	System.out.println("array list is  "+arr);
}
}
