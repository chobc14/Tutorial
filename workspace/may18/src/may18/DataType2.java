package may18;
// �Ǽ�
	//float
	//double(�⺻)
public class DataType2 {

	public static void main(String[] args) {
		//������Ÿ�� ������ = ��;
		//3.14
		double pi = 3.14;
		System.out.println(pi);

		int intNum = (int) pi;
		System.out.println(intNum);//3
		
		long longNum = (long) pi;
		System.out.println(longNum);//3
		
		pi = longNum;
		System.out.println(pi);//3.0
		
		pi = (int) longNum;
	
		pi = Long.MAX_VALUE;
		System.out.println(pi);
		
		
		//float
		
		float fNum = (float) 3.14;
		float fNum2 = 3.14F;
		System.out.println(fNum);
		System.out.println(fNum2);
		
		// float int
		
		fNum2 = intNum;
		intNum = (int) fNum;
		
		//float long
		longNum = (long) fNum;
		System.out.println(Double.MAX_VALUE);
		//1.7976931348623157E308
		System.out.println(Long.MAX_VALUE);
		//9,223,372,036,854,775,807
		
		
		pi = Double.MAX_VALUE;
		longNum = (long) pi;
		
		System.out.println(longNum);
		//9,223,372,036,854,775,807
	/* �Ǽ��� 
	 * float and double
	 * double�� �⺻Ÿ��
	 * float�� ���� �Ǽ������� �ʱ�ȭ �Ҷ���
	 * ǥ���ڸ� �־�� �� �ƴϸ� ����
	 * ������ �Ǽ����� double �޸𸮷� ����
	 * �׷��� float�� ������ �ȵ�
	 * 
	 * ����2
	 * ���� ���̶� �ü��� �������� ������ ūŸ��
	 * float could 4byte but it acknowledges as a bigger type than long
	 * ���� ���� ������ ������ ĳ�����ϱ�
	 * 
	 */
		
		fNum = 3.14F + 3.14F;
		fNum2 = fNum = 3.14F;
		intNum = (int) (3.14 + 3.0);// 2���߿� ���� ūŸ������ ���
		intNum = (int) (3 + longNum);
		
		//byte or short (smaller than ��Ʈ)
		
		byte bNum = 3;
		short sNum = 5;
		sNum = 3 + 100;
		bNum = (byte) (126 + 19);
		/*������ ��Ʈ �� �Ǽ��� double�� ����
		 * ���� Ÿ�԰� ū Ÿ�� ���ÿ� �⺻ Ÿ�� �����̸� 
		 * �⺻Ÿ������ ��ȭ �e ����̵�
		 * �⺻Ÿ�� �̻��� ��쿡�� ������ ū Ÿ������ ��ȯ�� ���
		 * 
		 * ����
		 * 8������ ����0��, 16���� ����0x��
		 * */
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
		
	
	
	}
	
	
	
	
	
	
	

}
