import java.util.Scanner;
public class BmiCalculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the HW-BMI calculator");
		
		System.out.println("================================");	
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your height(m)");
		double height = scanner.nextDouble();

		System.out.println("Please enter your weight(kg)");
		int weight = scanner.nextInt();
		
		double BMI = weight/(height*height);
		
		System.out.println("Your BMI is -> "+BMI);
		
		System.out.println("Your height in (meter) "+height);
		
		System.out.println("Your weight in (kilograms) "+weight);
		
		double heightF = (height*3.28);
		
		System.out.println("Your height in (feet) "+heightF);
		
		double weightP = (weight*2.2);
		
		System.out.println("Your weight in (pound) "+weightP);
		
		if (BMI < 18.5) {
			System.out.println("You are Underweight!");
		}
		
		if ((BMI >= 18.5)&&(BMI <= 24.9)) {
			System.out.println("You are Healthy!");
		}
		
		if (BMI > 24.9) {
			System.out.println("You are Overweight!");
		}
		
	}

}
