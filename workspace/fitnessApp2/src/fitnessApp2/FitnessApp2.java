package fitnessApp2;

import java.util.Scanner;

public class FitnessApp2 {

	private Scanner sc;
	public int totalProtein;
	
	public FitnessApp2() {
		sc = new Scanner(System.in);
	}
	
	public  void execute() {

		System.out.println("fitness앱입니다, 무엇을 드셨습니까?");
		System.out.println("1. 아침 2. 점심 3. 저녁 4. 간식 5. 나가기");
		int input = sc.nextInt();
		switch (input) {
		case 1:
			breakfast();
			break;
		case 2:
			lunch( );
			break;
		case 3:
			dinner();
			break;
		case 4:
			snack();
			break;
		case 5:
			System.out.println("byebye~");;
			break;

		default:
			break;
		}
		
		test();
	} // main
	
	private void breakfast() {
		System.out.println("1. 아침을 드셨습니다.");
		System.out.println("아침에 단백질 몇 그람?");
		System.out.println("1. 20g 2. 30g 3.none");
		int input = sc.nextInt();
		if (input == 1) {
			 totalProtein += 20;
			System.out.println(totalProtein +"g for Breakfast \n=================");
		
		}
		else if (input == 2) {
			 totalProtein += 30;
			System.out.println(totalProtein+ "g for Breakfast \n=================");
		}
		else if (input == 3) {
			System.out.println("none");
		}
		
		lunch();
	}
	private void lunch() {
		System.out.println("2. 점심을 드셨습니다.");
		System.out.println("점심에 단백질 몇 그람?");
		System.out.println("1. 20g 2. 30g 3.none");
		int input = sc.nextInt();
		if (input == 1) {
			 totalProtein += 20;
			System.out.println("20g for Lunch" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
		}
		else if (input == 2) {
			 totalProtein += 30;
				System.out.println("30g for Lunch" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
				}
		else if (input == 3) {
			System.out.println("Total: "+totalProtein + "g");
		}
		dinner();
	}
	private void dinner() {
		System.out.println("3. 저녁을 드셨습니다.");
		System.out.println("저녁에 단백질 몇 그람?");
		System.out.println("1. 20g 2. 30g 3.none");
		int input = sc.nextInt();
		if (input == 1) {
			 totalProtein += 20;
			System.out.println("20g for Dinner" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
			
		}
		else if (input == 2) {
			 totalProtein += 30;
				System.out.println("30g for Dinner" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
		}
		else if (input == 3) {
			System.out.println("Total: "+totalProtein + "g");
			}
		snack();
	}
	private void snack( ) {
		System.out.println("3. 간식을 드셨습니다.");
		System.out.println("간식 단백질 몇 그람?");
		System.out.println("1. 20g 2. 30g 3.none");
		int input = sc.nextInt();
		if (input == 1) {
			totalProtein += 20;
			System.out.println("20g for Snack" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
			 
			System.out.println("total protein for the day = " + totalProtein + " grams");
		}
		else if (input == 2) {
			totalProtein += 30;
			System.out.println("30g for Snack" + "\nTotal: " +  totalProtein+"g"  + "\n=================");
			 
			System.out.println("total protein for the day = " + totalProtein + " grams");
		}		
		else if (input == 3) {
			System.out.println("Total: "+totalProtein + "g");
		}
	}

	private void test() {
		System.out.println("목표 프로틴");
		System.out.println(totalProtein);
	}
	private void eat() {
		totalProtein += 100 - totalProtein;
	}
}
