package may18;
//������ Ÿ��
/*�ڹٿ����� ���� ��� �� ���� ������ؼ��� �ݵ�� �� ���� Ÿ�Կ� �´� ������ ���
 * �̸� ������ Ÿ���̶� �θ�.
 * ������ Ÿ���� ũ�� (R ,P)�� ���� (reference, primitive)
 * 
 * Reference ����Ÿ��
 * Primitive �⺻Ÿ��
 * 
 * Primitive = ��ġ�� ������ ���� (�޸� ũ�⸦ �����ϰ� ������)
 * 
 *  ��ġ��(������, �Ǽ���)
 * 
 * 		������ 	1 byte
 *  			2 short
 *  			3 int (�⺻)
 *  			4 long
 * 
 * 		�Ǽ��� 5 float & 6 double(�⺻)
 * 
 * 7 ������=�ѱ���= a, ��, ��, $ (���� �ѱ��ڸ� �����)
 * 				character
 * 
 * 8 ����=��/���� = true or false (no data size)
 * 				boolean
 * 			
 */
public class DataType1 {

	public static void main(String[] args) {
		//�޼ҵ� �ٵ�ӿ��� ����Ǵ� ������ ����������� �Ѵ�. {�� ���ξȿ���}
		//������Ÿ��         ������ =��;
		byte 			byteNumber = 10;
		// -128~0~127 ����
		short shortNumber = byteNumber; //-32,768 ~ 32767
		shortNumber = 32767;
		
		int intNumber = 1000000; // ���ͷ�
		
		intNumber = Integer.MAX_VALUE;
		intNumber = Integer.MIN_VALUE;
		
		long longNum = intNumber;
	
		longNum = Long.MIN_VALUE; // int�� �⺻�̸�, long�� intŸ�� �Ѿ ������ 
		longNum = 9223372036854775807L; // L ������ ��
	
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);//2,147,483,647
		System.out.println(longNum);//9,223,372,036,854,775,807
		// = ����          == ����
		intNumber = (int) longNum; // ��Ʈ�� ���� �ִ´�. �����߸� add cast to int 
			//cast , casting ( (int) ��Ʈ�� ��ȯ�ȴ�)
		short shortNum = (short) intNumber; // add cast to short
		
		byte byteNum = (byte) shortNum; // add cast to byte
		
		byteNum =(byte) -129; // ���� infinite���� ��� ���� 
	
		System.out.println(byteNum);
	
		/* ĳ���� / ĳ��Ʈ
		 * ū Ÿ���� ���� Ÿ�Կ� ������ҋ� ��� ���׸� -> ��׸�
		 * Ÿ���� ����ؼ� ���� ���Խ�Ŵ,
		 * ���� ��Ʈ�� �����ҋ� ���� Ÿ�Կ� �°� �߶󳻱� ������ ���� ��ȭ�� �� �� �ִ�. 
		 * byteNum = 100 �ȵǴϱ� byteNum = (byte)100 
		 * 
		 * shortNum = byteNum (���θ��)         ��׸� -> ���׸�
		 * ū Ÿ�Կ� ���� Ÿ���� ���ԵǴ� ��, ���� Ÿ���� ū Ÿ�ӿ� �ڵ����� ���� ��
		 * �� ��ȭ�� ����. 
		 * 
		 * 
		 * 
		 * intNumber = longNum; ĳ���� �� ���ֱ�
		 * intNumber = byteNum; �ڵ� ���� = ���θ�� 
		 * 
		 * 
		 * 
		 */
		intNumber = (int) longNum; //ĳ���� �� ���ֱ�
		intNumber = byteNum; //�ڵ� ���� = ���θ�� 
	}
	

}




















