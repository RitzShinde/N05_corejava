package met.tns.operator;
import java.util.*;
public class Assignment {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int Age = sc.nextInt();
		System.out.println("Enter your Weight");
		int Weight = sc.nextInt();
		if((Age > 18) && (Weight > 50)) {
			System.out.println("You are eligible to Donate your Blood");
		}
		else {
			System.out.println("You are not Eligible");
		}
		
	}

}
