import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Car[] arr = new Car[20];
		
		String[] brands = {"Mercedes", "BMW", "Audi", "Ferrari"};
		String[] models = {"Sedan", "SUV", "Hatchback", "Van"};
		String[] colors = {"Black", "White", "Red", "Blue"}; 

		int rnd_brand, rnd_model, rnd_color, rnd_year, rnd_price;
		
		for (int i = 0; i < arr.length; i++) {
			rnd_brand = rnd.nextInt(brands.length);
			rnd_model = rnd.nextInt(models.length);
			rnd_color = rnd.nextInt(colors.length);
			rnd_year = rnd.nextInt(40)+1970;
			rnd_price = rnd.nextInt(300000)+50000;
			
			arr[i] = new Car(i+1, brands[rnd_brand], models[rnd_model], rnd_year, colors[rnd_color], rnd_price, "JAVA"+(300+i));
		}
		
		
	}
	
}
