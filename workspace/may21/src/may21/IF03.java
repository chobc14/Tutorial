package may21;
// if practice
public class IF03 {

	public static void main(String[] args) {
		// 랜덤값 뽑기
		//for (int i = 0; i <1000; i++) { 1000 번 돌리기
		
			double random = Math.random()* 5;//0.06696323272015126 pseudorandom
			System.out.println(random);
			
			
			int number = (int)random; // rounding decimal
			System.out.println(number);
			
			int number1 = (int) (Math.random() * 5);
			System.out.println(number1);// 상단에 있는 거 합치기
		
			
			if(number1 == 1) {
				System.out.println(" 1 입니다");
			}else if (number1 ==2) {
				System.out.println(" 2 입니다");
			}else if ( number1 == 3) {
				System.out.println(" 3 입니다");
			}else if ( number1 == 4) {
				System.out.println(" 4 입니다");
			}else {
				System.out.println(" 5 입니다");
			}
	
		}
			
		
		
		
		
		
	}
		



