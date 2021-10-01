import java.util.Scanner;
public class Voter_Eligiblity_Check {
	public static void main(String[] args) {
		int age ;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Please Enter The Age: ");
		age = Sc.nextInt();
		
		if (age>=18) {
			System.out.println("Eligible For Vote");
			
			
		}
		else {
			
			System.out.println("Not Eligible For Vote");
		}
		
		
		
		
		
	}

}
