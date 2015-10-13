public class demo {

//Initiablize the variables
	
		int i,j,k;
	
		
		
		int demo(int r){
			k = r;
			return i+j+k;
		}
		
		//Addition
		int add(int a,int b){
			i=a;
			j=b;
			return i+j;
		
		}
		
		//Subtraction
		int sub(int a ,int b){
			i =a;
			j=b;
			return i-j;
		}
		
				
		public static void main(String args[]){
					
			demo d1 = new demo();
			int l = d1.add(4,5);
			int s = d1.sub(7, 5);
			int c = d1.demo(5);
			System.out.println("Addition is  "+l);
			System.out.println("Subtraction is "+s);
			System.out.println("Subtraction is "+c);
		}
		
	}

