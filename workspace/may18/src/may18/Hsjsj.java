package may18;

public class Hsjsj {
	public static void main(String[] args) {
		
		System.out.println("평균 값을 " + "구하라.");
		System.out.println(17 + " / 24");
		
		
		
		int apple, pear, orange;
		apple = 5;
		pear = 7;
		orange = 5;
		
		int total = apple + pear + orange;
		
		float avg = (float) (total/ 24.0);// 정수 나누기 정수는 0.0 (24.0) 으로 변환
										// 그래서 앞에 (float) 가 있음. 
		
		System.out.println("총 생산 수 : " + total);
		System.out.println("시간당 생산 갯수 : " + avg);
	}
}
 