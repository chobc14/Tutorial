package may18;
// 실수
	//float
	//double(기본)
public class DataType2 {

	public static void main(String[] args) {
		//데이터타입 변수명 = 값;
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
	/* 실수형 
	 * float and double
	 * double이 기본타입
	 * float에 값을 실수형으로 초기화 할때는
	 * 표식자를 넣어야 함 아니면 에러
	 * 이유는 실수값이 double 메모리로 생성
	 * 그래고 float에 대입이 안됨
	 * 
	 * 주의2
	 * 같은 값이라도 시수는 정수보다 무조건 큰타입
	 * float could 4byte but it acknowledges as a bigger type than long
	 * 따라서 값을 대입할 때에는 캐스팅하기
	 * 
	 */
		
		fNum = 3.14F + 3.14F;
		fNum2 = fNum = 3.14F;
		intNum = (int) (3.14 + 3.0);// 2개중에 가장 큰타입으로 계산
		intNum = (int) (3 + longNum);
		
		//byte or short (smaller than 인트)
		
		byte bNum = 3;
		short sNum = 5;
		sNum = 3 + 100;
		bNum = (byte) (126 + 19);
		/*정수는 인트 로 실수는 double로 계산됨
		 * 작은 타입과 큰 타입 계산시엔 기본 타입 이하이면 
		 * 기본타입으로 변화 킻 계산이됨
		 * 기본타입 이상일 경우에는 무조건 큰 타입으로 변환후 계산
		 * 
		 * 진법
		 * 8진수는 숫자0값, 16진수 숫자0x값
		 * */
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
		
		
		
		
	
	
	}
	
	
	
	
	
	
	

}
