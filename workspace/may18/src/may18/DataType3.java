package may18;
//char ������
//�ϳ��� ����
/* �ݵ�� ���� �ϳ��� �;ߵ�
 * �ϳ� �̻��� ��쿡�� String�� ���� 
 * �ϳ� �̻��� ��� " " �� ����
 * ������ Ÿ�� 0~65, 535= 2byte (������ ����)
 * 
 * ������ ����� Ȧ����ǥ�� ����
 * 
 * �������̱⿡ int�� ���θ�� ����
 * �ݴ�� int ������ ���ڷ� ���� ����(cast)
 * 
 */
public class DataType3 {

	public static void main(String[] args) {
		//������ �ʱ�ȭ�ϱ�
		/*������ Ÿ�� ������ = '��';
		 * 
		 */
		
		char char1 = 'A';
		char char2 = '��';
		char char3 = '��';
		char1= 100;
		char2= '\ub777'; //�ƽ�Ű�ڵ�� �����ڵ� utf-8 euc-kr, ms949
		
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		System.out.println((char) 50);
		System.out.println((char) 51);
		System.out.println((char) 52);
		System.out.println((char) 53);
		System.out.println((char) 54);
		
		for (int i=1; i < 128; i++) {
			System.out.print(i + " : " + (char) i + " \n ");
		}

	

	String str = "������" ;
	str = "" + char1 + char2 + char3;
	System.out.println(str);
	
	int iNum = char1;
	System.out.println(iNum);//46985 63759
	
	int inum2 = 0xb127;
	
	System.out.println(inum2);//44531
	System.out.println((char) iNum);// ��
	
	
	//////////////////////////////////////////������
	//boolean ��, ����
	
	boolean check = false;
	
	System.out.println(check);// true or false
	System.out.println("������ ���ñ");
	System.out.println('a' == 'g');
	
	iNum = 10;
	inum2 = 11; 
	
	System.out.println(iNum == inum2);
	
	check = iNum == inum2 + 1; //�¾�? O?
	System.out.println("����� : " + check);
	
	check = iNum != inum2 + 1;// ! not! �޶�? X?
	System.out.println("����� : " + check);
	//�� ���� �����ϴ� Ÿ��.
	// off         false  /  on       true
	
	//String is r type
	/* ������
	 * Byte
	 * Short                    
	 * ��Ʈ 
	 * Long                   ��ġ��
	 * �Ǽ���
	 * Float 
	 * Double
	 * 
	 * Character ������
	 * Boolean	������
	 * 
	 */
	
	int code = 1;
	int result = code % 2;//��ⷯ = ������ ��
	check = result == 0;
	
	
	if(check) {// ���࿡ check�� ���̶��
		System.out.println("����� ����"); //�� 1
	} else {
		System.out.println("����� ����"); // ���� 2
	}
	}
	
	
	
}
	



