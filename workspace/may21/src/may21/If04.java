package may21;
/*	1. ������ �� ���� �����ϱ�
 * 	2. if������ ũ�� �� (�ڸ� �ٲٱ�)
 * 	3. ū ������ ���
 * 
 */
public class If04 {

	public static void main(String[] args) {
		
		
		int random1 = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		
		if( random1< random2) {
			int temp = 0;
			temp = random1;
			random1 = random2;
			random2 = temp;
			
			System.out.println(temp);
			/* ������ ������: ������ ������ � �������� �����Ǵ���
			 * 
			 */
		}
			System.out.println(random1 + " > " + random2);
	}

}