import java.util.Scanner;

public class TicketCharge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int Age=scan.nextInt();
		
	
		
		if (Age >= 55 ) {
		System.out.println("Themepark is RM 10 ");
		System.out.println("Waterpark is  RM 15 ");
		System.out.println("Both Park is RM 20");
			
		}else if ( Age>= 21 && Age <= 54){
			System.out.println("Themepark is RM 25 ");
			System.out.println("Waterpark is  RM 30 ");
			System.out.println("Both Park is RM 45");
		
		}else if ( Age >= 13 && Age<= 20 ) {
			System.out.println("Themepark is RM 20 ");
			System.out.println("Waterpark is  RM 25 ");
			System.out.println("Both Park is RM 40");
		} else if (Age >= 3 && Age <=12 ) {
			System.out.println("Themepark is RM 10 ");
			System.out.println("Waterpark is  RM 15 ");
			System.out.println("Both Park is RM 20");
		} else if (Age > 3 ) {
			System.out.println("Themepark is Free ");
			System.out.println("Waterpark is  RM 7 ");
			System.out.println("Both Park is RM 5");
		}
	}
}		
