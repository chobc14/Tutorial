package fitness3;

public class FoodDTO {

	private String name;
	private double carbs;
	private double protein;
	private double fat;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCarbs() {
		return carbs;
	}
	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}
	public double getProtein() {
		return protein;
	}
	public void setProtein(double protein) {
		this.protein = protein;
	}
	public double getFat() {
		return fat;
	}
	public void setFat(double fat) {
		this.fat = fat;
	}
	@Override
	public String toString() {
		return "FoodDTO [name=" + name + ", carbs=" + carbs + ", protein=" + protein + ", fat=" + fat + "]";
	}

	public void add(FoodDTO dto) {
		this.carbs+= dto.carbs;
		this.protein+= dto.protein;
		this.fat+=dto.fat;
		
	}
	
}
