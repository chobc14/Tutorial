package fitness3;

import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		ExcelReader er = new ExcelReader();
		HashMap<String, FoodDTO> map = er.read();
		
		App app = new App(map);
		app.execute();
	}
}
