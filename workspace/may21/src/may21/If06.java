package may21;
/*��ø
 * �ٱ����� ������ ���� �����ؾ���
 * �ȿ� �ִ� ���� �����Ǿ� �����. 
 * ���� �ٱ��� ������ ������ �ȵǸ� ������ �ȵ�.
 * 
 */
public class If06 {

	public static void main(String[] args) {

		double ran = Math.random() * 126 + 1;// random number 0 ~126
		System.out.println(ran);
		
		int number = (int) ran;
		System.out.println(number);
		
		//int number2 = (int)(Math.random()* 10 + 1);
		
		char ch = 'A';
		 ch = (char) number;
		System.out.println("���� ���� : " + ch);
	
		if(ch >= 'A') {//���� ũ�ٰ� ���ٴ� ���� ���� cap, no cap, Ư������
		System.out.println("���� �빮�� a ����");
			if(ch <= 'Z') {
			System.out.println("���� �빮�� �Դϴ�. ");
				}else {
				System.out.println("���� �빮�� ������ ������.");
					if(ch > 'a') {
					System.out.println("��ҹ��� ������ Ư������");
					}else {
						if( ch <= 'z');
						System.out.println("���� �ҹ����Դϴ�");
						} {
							System.out.println("���� �ҹ��� ���� Ư������");
						}
					}
				}
	}{// ����� ���ǹ�1�� �ݴ� "else"
			System.out.println("���� �빮��A����");
			char ch = 0;
			if(ch>='0' && ch <= '9') {
				System.out.println("�����Դϴ�. ");
			}
		}{
			char ch = 'A';
			ch = (char) ch;
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("���� �빮����.");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("�ҹ�����.");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("������");
		}
		if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') )
			System.out.println("���� ��ҹ����Դϴ�.");
		}{
			char ch = 0;
			if(Character. isUpperCase(ch)) {
				System.out.println("�빮�� �Դϴ�. ");
				
			} else if( Character. isLowerCase(ch)) {
				System.out.println("�����Դϴ�.");
				
			} else {
				System.out.println("Ư�������Դϴ�.");
			}
				}}
//API
/*application programming interface
 * 
 */
		




















