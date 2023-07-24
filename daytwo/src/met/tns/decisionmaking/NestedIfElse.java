package met.tns.decisionmaking;
import java.util.*;
public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age>=12) {
			if(weight>=40 && weight<=110) {
				System.out.println("You are Eligible");
			}
			else if(weight>110){
				System.out.println("You are Eligible but you require an extra Rope");
				
			}
			else {
				System.out.println("You are not Eligible");
			}
		}
		

	}

}
