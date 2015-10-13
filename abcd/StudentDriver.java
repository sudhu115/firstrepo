
public class StudentDriver{
public static void main(String args[]){    
	
    Address home = new Address("1238 unisity park rd  ","Steger", "IL", 60475);
    Address school = new Address("7483  moneeth St", "Steger", "IL", 60475);
    Student radha = new Student("Radha", "Nalluri", home, school);
    Student jack = new Student("jack", "mouon", home, school, 90, 80, 199);
    
    System.out.println(radha);
    System.out.println("\n");
    System.out.println(jack);
}
}