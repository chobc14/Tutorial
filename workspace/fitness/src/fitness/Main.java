package fitness;

import java.util.Scanner;

class Menu {
	
	public int number;
	public String name;
	
	public Menu(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void Process() {
		System.out.println(name);
	}
}

class MenuBreakFast extends Menu {
	
	public MenuBreakFast(int number, String name) {
		super(number, name);
	}
	
	@Override
	public void Process() {
		super.Process();
		
		System.out.println("아침밥으로 먹었다");
	}
}

class MenuLaunch extends Menu {
	
	public MenuLaunch(int number, String name) {
		super(number, name);
	}
	
	@Override
	public void Process() {
		super.Process();
		
		System.out.println("점심밥으로 먹었다");
	}
}

public class Main {
	
	public static Menu[] MenuArr;
	
	public static final int BREAK_FAST = 0;
	public static final int LUNCH = 1;
	public static final int DINNER = 2;
	public static final int SNACK = 3;
	public static final int EXIT = 4;
	
	public static void main(String[] args) {
		MenuArr = new Menu[5];
		MenuArr[0] = new MenuBreakFast(1, "아침");
		MenuArr[1] = new MenuLaunch(2, "점심");
		MenuArr[2] = new Menu(3, "저녁");
		MenuArr[3] = new Menu(4, "간식");
		MenuArr[4] = new Menu(5, "나가기");
		
		// 안내 메세지를 출력한다
		System.out.println("fitness앱입니다, 무엇을 드셨습니까?");

		for (int i = 0; i < MenuArr.length; i++) {
			System.out.print(MenuArr[i].number + ". " + MenuArr[i].name + " ");
		}
		System.out.println();
		
		// 수행할 동작을 선택한다
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		GetMenu(input).Process();
	}
	
	private static Menu GetMenu(int input) {
		for (int i = 0; i < MenuArr.length; i++) {
			if (MenuArr[i].number == input)
				return MenuArr[i];
		}
		return null;
	}
}
