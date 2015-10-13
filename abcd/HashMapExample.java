import java.util.*;
public class HashMapExample {

	public static void main(String args[]){
		HashMap<Integer,String> hMap = new HashMap<Integer,String>();
		hMap.put(1, "Siva");
		hMap.put(2, "Krishna");
		hMap.put(3, "Thumati");
		hMap.put(4, "Steger");
		
		
		
		for (Map.Entry mp  : hMap.entrySet())
		{
			System.out.println(mp.getKey()  + " is " + mp.getValue());
		}
		/*Set s = hMap.entrySet();
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			Map.Entry mentry = (Map.Entry)itr.next();
			System.out.println("Key is "+ mentry.getKey() + "value is " + mentry.getValue()); 
			
		}*/
		
	}
}
