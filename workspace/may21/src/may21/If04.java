package may21;
/*	1. 랜덤한 두 값을 생성하기
 * 	2. if문으로 크기 비교 (자리 바꾸기)
 * 	3. 큰 수부터 출력
 * 
 */
public class If04 {

	public static void main(String[] args) {
		
		
		int random1 = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		
		if( random1< random2) {
			int temp = 0;
			temp = random1;
			random1 = random2;
			random2 = temp;
			
			System.out.println(temp);
			/* 데이터 스코프: 선언한 변수가 어떤 범위까지 유지되는지
			 * 
			 */
		}
			System.out.println(random1 + " > " + random2);
	}

}
