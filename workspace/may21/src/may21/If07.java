package may21;

import java.util.Scanner;

//game 
public class If07 {
	 public static void main(String[] args) {
	
		
		 	//1. 사용자의 입력 받기 = scanner (receiving data from user)
		 // 데이터 타입 변수명 = 값	(data type variable name = value)
			Scanner sc = new Scanner(System.in);// 객체 생성 (create entity)
			System.out.println("1. scissors 2. rock 3. paper");
			System.out.println("pick a number.");
			int user = sc.nextInt();
		
			
			//2. 컴유터의 숫자 저장하기 ( saving pc's number code)
			int com = (int) (Math.random() * 3 + 1);// 1 2 3
					
			
			//3. 판정하기 출력하기 ( activation)
			if(user % com == 0 ) {
				System.out.println("tie");
			}else if( (user == 1 && com == 2)
			|| (user == 2 && com == 3)
			|| (user == 3 && com == 1)){
				System.out.println("pc win");
			} else {
				System.out.println("user win");
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
}
