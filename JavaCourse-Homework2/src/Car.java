
public class Car {

	private int id;	
	private String brand;
	private String model;
	private int year;
	private String color;
	private int price;
	private String registration_number;
	
	public Car() {
		
	}
	
	public Car(int id, String brand, String model, int year, String color, int price, String registration_number) {
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.price = price;
		this.registration_number = registration_number;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}
	
	@Override
	public String toString() {
		return this.getId() 
				+ "\t" + this.getBrand()
				+ "\t" + this.getModel()
				+ "\t" + this.getColor()
				+ "\t" + this.getYear()
				+ "\t" + this.getPrice();
	}
	
	public String toStringByComma() {
		return this.getId() 
				+ "," + this.getBrand()
				+ "," + this.getModel()
				+ "," + this.getColor()
				+ "," + this.getYear()
				+ "," + this.getPrice();
	}
	
}


