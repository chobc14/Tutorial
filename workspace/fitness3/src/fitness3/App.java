package fitness3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	private HashMap<String, FoodDTO> map;

	private FoodDTO  nutritionT;
	private FoodDTO nutritionW;
	private Scanner sc;
	
	
	public App(HashMap<String, FoodDTO> map) {
		sc = new Scanner(System.in);
		this.map = map;
		nutritionT = new FoodDTO();
		nutritionW = new FoodDTO();
		nutritionW.setProtein(140);
		nutritionW.setCarbs(120);
		nutritionW.setFat(70);
	}

	public void execute() {
		// 먹은 음식 입력
		
		plusintake("아침");
		plusintake("점심");
		plusintake("저녁");
		

	}
	

	private void printTest() {
		for (Map.Entry<String, FoodDTO> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().toString());
			System.out.println();
		}
	}
	private void plusintake(String meal) {
		System.out.println(meal + " 먹은 음식을 입력해주세요.");
		FoodDTO dto = new FoodDTO();
		
		String breakfast = sc.next();
		
		if (map.containsKey(breakfast)) {
			dto = map.get(breakfast);	
			System.out.println(dto);
		} else {
			System.out.println("해당 음식에 대한 정보가 없습니다.");
		}
		// map에서 음식을 찾아서 총 영양소에 더한다..
		nutritionT.add(dto);
		
		System.out.println("단백질 : [" + nutritionT.getProtein() + "/" + nutritionW.getProtein() + "], " +
				"탄수화물 : ["+ nutritionT.getCarbs() + "/" + nutritionW.getCarbs() + "], " +
				"지방 : ["+ nutritionT.getFat() + "/" + nutritionW.getFat() + "]");
		System.out.print("less than ");
		System.out.print(nutritionW.getProtein()-nutritionT.getProtein());
		System.out.print("g for today");
	}
}
