import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter The Year :");
	year = sc.nextInt();
	
	if((year%400==0) || ((year%4==0) && (year%100!=0))){
        System.out.println(year+" is a Leap Year.");
    }
    else {
        System.out.println(year+" is not a Leap Year.");

	}

}
}