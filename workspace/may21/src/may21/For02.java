package may21;
//fizz buzz
public class For02 {
	public static void main(String[] args) {
	
			int result = 0;
			for (int i = 1; i <= 26; i++) {
				if  (i % 3 == 0 && i % 5 == 0){
					System.out.println("fizz");
			} else if (i % 5 == 0) {
						System.out.println("buzz");
					
			} else if ( i % 3 == 0) {
						System.out.println("fizzbuzz");
					
			} else {
				
						System.out.println(i);
			}
						
	}
}}


