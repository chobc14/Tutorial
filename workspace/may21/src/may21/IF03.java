package may21;
// if practice
public class IF03 {

	public static void main(String[] args) {
		// ������ �̱�
		//for (int i = 0; i <1000; i++) { 1000 �� ������
		
			double random = Math.random()* 5;//0.06696323272015126 pseudorandom
			System.out.println(random);
			
			
			int number = (int)random; // rounding decimal
			System.out.println(number);
			
			int number1 = (int) (Math.random() * 5);
			System.out.println(number1);// ��ܿ� �ִ� �� ��ġ��
		
			
			if(number1 == 1) {
				System.out.println(" 1 �Դϴ�");
			}else if (number1 ==2) {
				System.out.println(" 2 �Դϴ�");
			}else if ( number1 == 3) {
				System.out.println(" 3 �Դϴ�");
			}else if ( number1 == 4) {
				System.out.println(" 4 �Դϴ�");
			}else {
				System.out.println(" 5 �Դϴ�");
			}
	
		}
			
		
		
		
		
		
	}
		



