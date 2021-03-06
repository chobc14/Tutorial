package may21;

import java.util.Scanner;
/* 4일차
 * 자바 설치 oraclejdk, open jdk
 *  **** window jdk 한번 깔아보기
 *  REVIEW*************************************************************
 *  JDK = java developing tool, needed for developing, includes JRE
 *  JRE = java activation,  only for activating (using), includes JVM
 *  
 *  변수= 값이 변함, 
 *	상수= 절대 값이 안 변함, final int INT_NUMBER = 100;(수정불가)
 *  
 *  자바에서 사용가능한 문자: 영어 대문자 소문자 숫자 _ $
 *  표기법
 *  		파스칼 = 대문자 HelloKorea		Class
 *  		카멜 =   소문자	helloKorea		method and 변수
 *  		스네이크 대문자 HELLO_KOREA 상수에 사용
 *  
 *  데이터타입 r and p
 *   		기본 타입 primitive
 * 
 *  	숫자, 정수 = byte 1 short 2 int(*) 4 long 8
 *  	숫자 실수  = double 4 and float 8
 *  	문자	   = character (one word) 문자열=
 * 		논리 	   = boolean 참과 거짓 (off/on)
 * 		
 *   reference 참조 타입 상단의 기본 타입을 제외한 모든 것
 *  
 *  	데이터 타입 변환
 *  		작은 것이 큰것에 : 큰것의 단위로 바꿈 promotion
 *  		큰것이 작은 것에 : 작은 것의 단위로 바꿈 casting
 *  					^^^^^^^^^^^^^^값이 변경될 수 있음
 *  	왼쪽 = (왼쪽타입) 오른쪽
 *		byte = (byte) long;   
 *  데이터 스코프 = 오늘 5월 21일 금에 배울 것. 
 *  
 * 
 *  
 */

public class Inout01 {// class -> method -> cmd) // 클래스 속에 클래스 X
	public static void main(String[] args) {///method

		Scanner sc = new Scanner(System.in);// 자바 in// 열기
		System.out.println("숫자를 입력하세요");//cmd

		int input = sc.nextInt();

		
		
		if (input > 5) {// 1 + 1 > 1 / input console창에 입력하기. 
		//	조건이 참일때 실행할 명령문;
			
			 System.out.print("5보다 큼");
		} else if (input < 5){// 참 + 거짓 할려면 else 문자 도입
			//조건이 거짓일 떄 실행항 명령문
			System.out.print("5보다 작음");
		} else if (input == 5){
			//위 조건이 다 거짓일때 실행할 명령문
			System.out.print("5입니다");
		}
		
		
		
		
		if (input % 2 == 0)
			System.out.println("짝수.");
		}

		{//////// 자바 out
		System.out.println("홀수.");
		}

	// sc.close(); //입력 들어오는 스캐너 닫기.
}
