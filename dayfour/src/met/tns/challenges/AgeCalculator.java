package met.tns.challenges;
import java.util.*;
/*Ask the user for their birth year encode it as two digit (like "62") and for the current year, also encode it as two digit
 * like("99")     write a program to find the users current age in years.*/
public class AgeCalculator {
	
	public static void ageCal(int c, int b) {
		if(c>b) {
			System.out.println("Current age will be:"+(c-b));
			
		}
		else {
			System.out.println("CUrrent age will be:"+(100-b)+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int c = sc.nextInt();
		ageCal(c,b);
//		if(c>b) {
//			System.out.println("Current age will be:"+(c-b));
//			
//		}
//		else {
//			System.out.println("CUrrent age will be:"+(100-(b+c)));
//		}
		
		
		
		

	}

}
