package may21;
//to the number that the user inserts, it will show on the console
//utilizing scanner
import java.util.Scanner;

// 2�� ���
public class For04 {
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		System.out.println("insert dan");
		int dan = sc.nextInt();
		System.out.println("insert number.");
		int input = sc.nextInt();
		
		// for �� 2��
		for (int i = 1; i <= input; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
		
		
	}
}
