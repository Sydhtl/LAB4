import java.util.Scanner;

public class TuitionFees {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String MCS;
		String ME;
		String MPM;
		String MEOH;
		
		int fee1stSemMCS= 1250;
		int fee2ndSemMCS= 1000;
		
		int fee1stSemME= 1400;
		int fee2ndSemME=1100;
		
		int fee1stSemMPM=1250;
		int fee2ndSemMPM=1000;
		
		int fee1stSemMEOH=1250;
		int fee2ndSemMEOH=1000;
		
		int feePerCreditMCS= 250;
		int feePerCreditME=250;
		int feePerCreditMPM= 275;
		int feePerCreditMEOH=350;
		
		System.out.println("This is the code for each programme ");
		System.out.println("\nCode MCS for Master of Computer Science");
		System.out.println("Code ME for Master of Environment");
		System.out.println("Code MPM for Master in Plantation Management ");
		System.out.println("Code MEOH for Master of Environmental and Occupational Health ");
		
		System.out.println("\nState your code programme ");
		String codeProgramme = scan.nextLine();
		System.out.println("Current Semester?");
		int Sem = scan.nextInt();
		System.out.println("Credit Hour Registered?");
		int CreditHours= scan.nextInt();
		
		System.out.println("\nThe code programme : " +codeProgramme);
		System.out.println("Semester Number : "+ Sem);
		System.out.println("Credit Hour Registered : " + CreditHours);
		
		switch(codeProgramme) {
		case("MCS"):
			System.out.println("********************************************");
			
			if(Sem == 1) {
				System.out.println("\nMaster programme : Master of Computer Science");
				System.out.println("Semester No: " + Sem);
				System.out.println("Credit Hours :" + CreditHours);
				System.out.println("Total Tuition Fees :RM " +  (fee1stSemMCS +(feePerCreditMCS* CreditHours)));
		}
		
			else if (Sem==2) {
				System.out.println("\nMaster programme : Master of Computer Science");
				System.out.println("Semester No: " + Sem);
				System.out.println("Credit Hours :" + CreditHours);
				System.out.println("Total Tuition Fees :RM " +  (fee2ndSemMCS +(feePerCreditMCS* CreditHours)));
				
		}
			else 
				System.out.println("\nERROR!");
			
			break;
			
		case("ME"):
			System.out.println("********************************************");
		
		if(Sem==1) {
			System.out.println("\nMaster programme : Master of Environment");
			System.out.println("Semester No: " + Sem);
		System.out.println("Credit Hours :" + CreditHours);
		System.out.println("Total Tuition Fees :RM " +  (fee1stSemME +(feePerCreditME* CreditHours)));

		}
		else if(Sem==2) {
			System.out.println("\nMaster programme : Master of Environment");
			System.out.println("Semester No: " + Sem);
			System.out.println("Credit Hours :" + CreditHours);
			System.out.println("Total Tuition Fees :RM " +  (fee2ndSemME +(feePerCreditME* CreditHours)));
		}
		else 
			System.out.println("\nERROR!");
		
		break;
		
		case("MPM"):
			System.out.println("********************************************");
		if(Sem==1) {
			System.out.println("\nMaster programme : Master in Plantation Management");
			System.out.println("Semester No: " + Sem);
			System.out.println("Credit Hours :" + CreditHours);
			System.out.println("Total Tuition Fees :RM " +  (fee1stSemMPM +(feePerCreditMPM* CreditHours)));
		}
		else if(Sem==2) {
			System.out.println("\nMaster programme : Master in Plantation Management");
			System.out.println("Semester No: " + Sem);
			System.out.println("Credit Hours :" + CreditHours);
			System.out.println("Total Tuition Fees :RM " +  (fee2ndSemMPM +(feePerCreditMPM* CreditHours)));
		}
		
		else 
			System.out.println("\nERROR!");
		
		break;
		
		case("MEOH"):
			System.out.println("********************************************");
			if(Sem==1) {
				System.out.println("\nMaster programme : Master of Environmental and Occupational Health");	
				System.out.println("Semester No: " + Sem);
				System.out.println("Credit Hours :" + CreditHours);
				System.out.println("Total Tuition Fees :RM " +  (fee1stSemMEOH +(feePerCreditMEOH* CreditHours)));
			}
			else if (Sem==2) {
				System.out.println("\nMaster programme : Master of Environmental and Occupational Health");	
				System.out.println("Semester No: " + Sem);
				System.out.println("Credit Hours :" + CreditHours);
				System.out.println("Total Tuition Fees :RM " +  (fee2ndSemMEOH +(feePerCreditMEOH* CreditHours)));
			}
			else 
				System.out.println("\nERROR!");
			break;
			
			default:
				System.out.println("\nERROR!");
				break;
		}
	}
}






