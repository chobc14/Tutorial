package may21;
/*중첩
 * 바깥쪽의 조건이 먼저 충족해야지
 * 안에 있는 것이 충족되어 실행됨. 
 * 만약 바깥족 조건이 실행이 안되면 실행이 안됨.
 * 
 */
public class If06 {

	public static void main(String[] args) {

		double ran = Math.random() * 126 + 1;// random number 0 ~126
		System.out.println(ran);
		
		int number = (int) ran;
		System.out.println(number);
		
		//int number2 = (int)(Math.random()* 10 + 1);
		
		char ch = 'A';
		 ch = (char) number;
		System.out.println("뽑은 글자 : " + ch);
	
		if(ch >= 'A') {//보다 크다고 같다는 것은 영어 cap, no cap, 특수문자
		System.out.println("영어 대문자 a 이후");
			if(ch <= 'Z') {
			System.out.println("영어 대문자 입니다. ");
				}else {
				System.out.println("영어 대문자 이후의 문자임.");
					if(ch > 'a') {
					System.out.println("대소문자 사이의 특수문자");
					}else {
						if( ch <= 'z');
						System.out.println("영어 소문자입니다");
						} {
							System.out.println("영어 소문자 이후 특수문자");
						}
					}
				}
	}{// 상단의 조건문1의 반대 "else"
			System.out.println("영어 대문자A이전");
			char ch = 0;
			if(ch>='0' && ch <= '9') {
				System.out.println("숫자입니다. ");
			}
		}{
			char ch = 'A';
			ch = (char) ch;
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("영어 대문자임.");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자임.");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("숫자임");
		}
		if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') )
			System.out.println("영어 대소문자입니다.");
		}{
			char ch = 0;
			if(Character. isUpperCase(ch)) {
				System.out.println("대문자 입니다. ");
				
			} else if( Character. isLowerCase(ch)) {
				System.out.println("숫자입니다.");
				
			} else {
				System.out.println("특수문장입니다.");
			}
				}}
//API
/*application programming interface
 * 
 */
		





















