import java.util.Scanner;
public class Eligibility_4Marriage {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int age ;
		System.out.println("Enter Age :");
		age = sc.nextInt();
		System.out.println("Enter Gender(m/f):");
		char gender = sc.next().charAt(0);
		
		
		
		if (age>=25 && gender== 'm' ) {
			System.out.println("Eligible for marriage");
		}
		else if ( age>=21 && gender=='f')
		{
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("Not eligible");
		}
			
		sc.close();

	}

}
