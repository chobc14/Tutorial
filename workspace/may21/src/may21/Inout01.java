package may21;

import java.util.Scanner;
/* 4����
 * �ڹ� ��ġ oraclejdk, open jdk
 *  **** window jdk �ѹ� ��ƺ���
 *  REVIEW*************************************************************
 *  JDK = java developing tool, needed for developing, includes JRE
 *  JRE = java activation,  only for activating (using), includes JVM
 *  
 *  ����= ���� ����, 
 *	���= ���� ���� �� ����, final int INT_NUMBER = 100;(�����Ұ�)
 *  
 *  �ڹٿ��� ��밡���� ����: ���� �빮�� �ҹ��� ���� _ $
 *  ǥ���
 *  		�Ľ�Į = �빮�� HelloKorea		Class
 *  		ī�� =   �ҹ���	helloKorea		method and ����
 *  		������ũ �빮�� HELLO_KOREA ����� ���
 *  
 *  ������Ÿ�� r and p
 *   		�⺻ Ÿ�� primitive
 * 
 *  	����, ���� = byte 1 short 2 int(*) 4 long 8
 *  	���� �Ǽ�  = double 4 and float 8
 *  	����	   = character (one word) ���ڿ�=
 * 		���� 	   = boolean ���� ���� (off/on)
 * 		
 *   reference ���� Ÿ�� ����� �⺻ Ÿ���� ������ ��� ��
 *  
 *  	������ Ÿ�� ��ȯ
 *  		���� ���� ū�Ϳ� : ū���� ������ �ٲ� promotion
 *  		ū���� ���� �Ϳ� : ���� ���� ������ �ٲ� casting
 *  					^^^^^^^^^^^^^^���� ����� �� ����
 *  	���� = (����Ÿ��) ������
 *		byte = (byte) long;   
 *  ������ ������ = ���� 5�� 21�� �ݿ� ��� ��. 
 *  
 * 
 *  
 */

public class Inout01 {// class -> method -> cmd) // Ŭ���� �ӿ� Ŭ���� X
	public static void main(String[] args) {///method

		Scanner sc = new Scanner(System.in);// �ڹ� in// ����
		System.out.println("���ڸ� �Է��ϼ���");//cmd

		int input = sc.nextInt();

		
		
		if (input > 5) {// 1 + 1 > 1 / input consoleâ�� �Է��ϱ�. 
		//	������ ���϶� ������ ���ɹ�;
			
			 System.out.print("5���� ŭ");
		} else if (input < 5){// �� + ���� �ҷ��� else ���� ����
			//������ ������ �� ������ ���ɹ�
			System.out.print("5���� ����");
		} else if (input == 5){
			//�� ������ �� �����϶� ������ ���ɹ�
			System.out.print("5�Դϴ�");
		}
		
		
		
		
		if (input % 2 == 0)
			System.out.println("¦��.");
		}

		{//////// �ڹ� out
		System.out.println("Ȧ��.");
		}

	// sc.close(); //�Է� ������ ��ĳ�� �ݱ�.
}