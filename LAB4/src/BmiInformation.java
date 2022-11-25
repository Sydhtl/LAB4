import java.util.Scanner;

public class BmiInformation {

public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height in m");
		
		double height = scan.nextDouble();
		
		System.out.println("Enter your weight in kg");
		
		double weight=scan.nextDouble();
		
		double Bmi = (weight / (height*height));
		
		System.out.println("\nYour body mass index is " + String.format ("%.2f", Bmi) );
		
		if (Bmi >= 18.5 && Bmi<= 24.9) {
			System.out.println(" Your BMI is Normal");
			System.out.println("********************************************");}
		
		else if(Bmi >= 25 && Bmi<= 29.9) {
			System.out.println("Your BMI is Over Weight");
			System.out.println("********************************************");}
		
		else if (Bmi >= 30 && Bmi<= 34.9) {
			System.out.println("Your BMI is Obese");
			System.out.println("********************************************");}
		
		else if (Bmi >= 35) {
			System.out.println("Your BMI is Severey Obese");
			System.out.println("********************************************");}
		
		System.out.println("State your gender either Men or Women");
		
		String gender= scan.next();
		
		System.out.println("Enter your waist size in Inches");
		
		Double WaistSize = scan.nextDouble();
		
		switch(gender) {
			case("Women"):case("women"):
				if (WaistSize>35) {
					System.out.println("CAUTION!!");
					System.out.println("Women – waist size > 35 inches");
					System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
				}
				else {
					System.out.println("NORMAL");
					System.out.println("------ LOWER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
				}
			break;
			
			case("Men"):case("men"):
				
				if (WaistSize >40) {
					
					System.out.println("CAUTION!!");
					System.out.println("Men – waist size > 40 inches");
					System.out.println("----- HIGHER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
				}
				
				else {
					System.out.println("NORMAL");
					System.out.println("------ LOWER RISK FOR HEART DISEASE AND TYPE 2 DIABETES!!------");
				}
			break;
			
			default:
				System.out.println("ERROR");
				break;
		}
		
		
		
			
		}
		
		
}
