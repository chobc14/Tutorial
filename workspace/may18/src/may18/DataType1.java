package may18;
//데이터 타입
/*자바에서는 변수 상수 그 값을 담기위해서는 반드시 그 값의 타입에 맞는 변수를 사용
 * 이를 데이터 타입이라 부름.
 * 데이터 타입은 크게 (R ,P)로 구분 (reference, primitive)
 * 
 * Reference 참조타입
 * Primitive 기본타입
 * 
 * Primitive = 수치형 문자형 논리형 (메모리 크기를 엄격하게 제한함)
 * 
 *  수치형(정수형, 실수형)
 * 
 * 		정수형 	1 byte
 *  			2 short
 *  			3 int (기본)
 *  			4 long
 * 
 * 		실수형 5 float & 6 double(기본)
 * 
 * 7 문자형=한글자= a, 가, 趙, $ (글자 한글자만 담겨짐)
 * 				character
 * 
 * 8 논리형=참/거짓 = true or false (no data size)
 * 				boolean
 * 			
 */
public class DataType1 {

	public static void main(String[] args) {
		//메소드 바디속에서 선언되는 변수는 지역변수라고 한다. {이 가로안에서}
		//데이터타입         변수명 =값;
		byte 			byteNumber = 10;
		// -128~0~127 까지
		short shortNumber = byteNumber; //-32,768 ~ 32767
		shortNumber = 32767;
		
		int intNumber = 1000000; // 리터럴
		
		intNumber = Integer.MAX_VALUE;
		intNumber = Integer.MIN_VALUE;
		
		long longNum = intNumber;
	
		longNum = Long.MIN_VALUE; // int가 기본이며, long은 int타임 넘어서 사용못함 
		longNum = 9223372036854775807L; // L 넣으면 됨
	
		System.out.println(byteNumber);
		System.out.println(shortNumber);
		System.out.println(intNumber);//2,147,483,647
		System.out.println(longNum);//9,223,372,036,854,775,807
		// = 대입          == 같다
		intNumber = (int) longNum; // 인트에 렁넘 넣는다. 에러뜨면 add cast to int 
			//cast , casting ( (int) 인트로 변환된다)
		short shortNum = (short) intNumber; // add cast to short
		
		byte byteNum = (byte) shortNum; // add cast to byte
		
		byteNum =(byte) -129; // 값이 infinite으로 계속 돌림 
	
		System.out.println(byteNum);
	
		/* 캐스팅 / 캐스트
		 * 큰 타입을 작은 타입에 맞출려할떄 사용 국그릇 -> 밥그릇
		 * 타입을 명기해서 값을 대입시킴,
		 * 상위 비트를 대입할떄 작은 타입에 맞게 잘라내기 때문에 값의 변화가 올 수 있다. 
		 * byteNum = 100 안되니까 byteNum = (byte)100 
		 * 
		 * shortNum = byteNum (프로모션)         밥그릇 -> 국그릇
		 * 큰 타입에 작은 타입이 대입되는 것, 작은 타입이 큰 타임에 자동으로 들어가는 것
		 * 값 변화가 없음. 
		 * 
		 * 
		 * 
		 * intNumber = longNum; 캐스팅 꼭 해주기
		 * intNumber = byteNum; 자동 대입 = 프로모션 
		 * 
		 * 
		 * 
		 */
		intNumber = (int) longNum; //캐스팅 꼭 해주기
		intNumber = byteNum; //자동 대입 = 프로모션 
	}
	

}




















