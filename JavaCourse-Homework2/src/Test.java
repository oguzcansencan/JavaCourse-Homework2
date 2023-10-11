import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Car[] arr = new Car[50];
		
		String[] brands = {"Porsche", "BMW", "Audi", "Ferrari"};
		String[] models = {"Sedan", "SUV", "Van"};
		String[] colors = {"Black", "White", "Red", "Blue"}; 

		int rnd_brand, rnd_model, rnd_color, rnd_year, rnd_price;
		
		for (int i = 0; i < arr.length; i++) {
			rnd_brand = rnd.nextInt(brands.length);
			rnd_model = rnd.nextInt(models.length);
			rnd_color = rnd.nextInt(colors.length);
			rnd_year = rnd.nextInt(10)+2010;
			rnd_price = rnd.nextInt(250000)+100000;
			
			arr[i] = new Car(i+1, brands[rnd_brand], models[rnd_model], rnd_year, colors[rnd_color], rnd_price, "JAVA"+(300+i));
		}
		
		List<Car> filteredByBrand = getCarsByBrand(arr, "Porsche");
		List<Car> filteredByModelAndAge = getCarsByModelAndAge(arr, "Sedan", 5);
		List<Car> filteredByYearAndPrice = getCarsByYearAndPrice(arr, 2014, 220000);
		
		System.out.println("##### Task a #####");
		printCars(filteredByBrand);
		System.out.println("##### Task b #####");
		printCars(filteredByModelAndAge);
		System.out.println("##### Task c #####");
		printCars(filteredByYearAndPrice);
	}
	
	// Task a
	private static List<Car> getCarsByBrand(Car[] arr, String brand) {
		ArrayList<Car> list = new ArrayList<Car>();		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getBrand().equals(brand))
				list.add(arr[i]);
		}
		
		return list;
	}
	
	// Task b
	private static List<Car> getCarsByModelAndAge(Car[] arr, String model, int age){
		ArrayList<Car> list = new ArrayList<Car>();		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getModel().equals(model) && Year.now().getValue() - arr[i].getYear() >= age)
				list.add(arr[i]);
		}
		
		return list;
	}
	
	// Task c
	private static List<Car> getCarsByYearAndPrice(Car[] arr, int year, int price){
		ArrayList<Car> list = new ArrayList<Car>();		
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getYear() == year && arr[i].getPrice() >= price)
				list.add(arr[i]);
		}
		
		return list;
	}
	
	private static void printCars(List<Car> list) {
		System.out.println("ID\tBrand\tModel\tColor\tYear\tPrice");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
}
