package may21;

import java.util.Iterator;

/* �ڹٿ��� �ʿ信 ���� Ư�� ������ �ݺ������� �����ؾߵ�. 
 * in java, a specific sentence needs to repeated 
 * �̶� ����ϴ°� loop
 * you use loop for that specific case
 * �ڹٴ� �������� �ݺ��� ����
 * there are 3 repeated or redundant cmd
 * for(forEach), while, do-while�Դϴ�. 
 * 
 * for(���� �ʱ�ȭ; ���� ���ǹ�; ���� ������){
 * 		�������ǹ��� ���ϋ� ������ ����
 * }
 * 
 * for(variable reset; variable condition sentence; variable incerease/decrease) {
 * 		when the variable condition sentence is true it will activate. 
 */
public class For1 {

	public static void main(String[] args) {
		
		int result = 0;
		for (int i = 0; i <=10; i++) {
			if (i % 2 == 0) {// sum of the even numbers from 1~10
				result += i;
				System.out.println(i);
			}		
			
			System.out.println("total is" + result);// <---repeating selected words
			
		}
	}}



