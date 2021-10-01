package Assignments_Regex;
import java.util.Scanner;

public class Sales_Commission {

	public static void main(String[] args) {
		int sales, commission=0 ,total ;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Sales Amount:");
		sales=sc.nextInt();
		if (sales> 0 && sales <=1000) {
			commission = sales;
		}
		else if (sales>10000 && sales <= 20000) {
			commission= (int) (sales* 0.10);
		}
		else if (sales>20000 && sales <= 30000) {
			commission= (int) (sales* 0.20);
			
		}
		else if (sales>30000) {
			commission= (int) (sales* 0.25);
			
		}
		else {
			System.out.println("please enter valid Amount");
		}
		
		total = sales+commission;
		System.out.println("Sales Amount:"+sales+"\n"+"Commission:"+commission+"\n"+"Total:"+total);
		sc.close();

	}

}
