package may21;

import java.util.Iterator;

/* 자바에선 필요에 따라 특정 문장을 반복적으로 실행해야됨. 
 * in java, a specific sentence needs to repeated 
 * 이때 사용하는게 loop
 * you use loop for that specific case
 * 자바는 세가지의 반복문 제시
 * there are 3 repeated or redundant cmd
 * for(forEach), while, do-while입니다. 
 * 
 * for(변수 초기화; 변수 조건문; 변수 증감식){
 * 		변수조건문이 참일떄 실행할 문장
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



