package may18;
//char 문자형
//하나를 저장
/* 반드시 문자 하나가 와야됨
 * 하나 이상일 경우에는 String에 저장 
 * 하나 이상일 경우 " " 로 저장
 * 정수형 타입 0~65, 535= 2byte (음수가 없다)
 * 
 * 문자형 저장시 홀따옴표로 저장
 * 
 * 정수형이기에 int에 프로모션 가능
 * 반대로 int 값또한 문자로 변경 가능(cast)
 * 
 */
public class DataType3 {

	public static void main(String[] args) {
		//문자형 초기화하기
		/*데이터 타입 변수명 = '값';
		 * 
		 */
		
		char char1 = 'A';
		char char2 = '가';
		char char3 = '趙';
		char1= 100;
		char2= '\ub777'; //아스키코드와 유니코드 utf-8 euc-kr, ms949
		
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

	

	String str = "가나다" ;
	str = "" + char1 + char2 + char3;
	System.out.println(str);
	
	int iNum = char1;
	System.out.println(iNum);//46985 63759
	
	int inum2 = 0xb127;
	
	System.out.println(inum2);//44531
	System.out.println((char) iNum);// 넧
	
	
	//////////////////////////////////////////논리형
	//boolean 참, 거짓
	
	boolean check = false;
	
	System.out.println(check);// true or false
	System.out.println("무엇이 나올까여");
	System.out.println('a' == 'g');
	
	iNum = 10;
	inum2 = 11; 
	
	System.out.println(iNum == inum2);
	
	check = iNum == inum2 + 1; //맞아? O?
	System.out.println("결과는 : " + check);
	
	check = iNum != inum2 + 1;// ! not! 달라? X?
	System.out.println("결과는 : " + check);
	//참 거짓 저장하는 타입.
	// off         false  /  on       true
	
	//String is r type
	/* 정수형
	 * Byte
	 * Short                    
	 * 인트 
	 * Long                   수치형
	 * 실수형
	 * Float 
	 * Double
	 * 
	 * Character 문자형
	 * Boolean	논리형
	 * 
	 */
	
	int code = 1;
	int result = code % 2;//모듈러 = 나머지 값
	check = result == 0;
	
	
	if(check) {// 만약에 check가 참이라면
		System.out.println("당신은 여자"); //참 1
	} else {
		System.out.println("당신은 남자"); // 거짓 2
	}
	}
	
	
	
}
	




