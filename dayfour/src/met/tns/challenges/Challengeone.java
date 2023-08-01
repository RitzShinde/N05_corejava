package met.tns.challenges;
import java.util.*;
/* A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time and when heating 3 
 * items double the heating time. Heating more than 3 items in once is not recommended. WAP to find out recommended
 * heating time.  input  item=2 and heating time=5.0*/
import java.util.Scanner;

public class Challengeone {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int item = scanner.nextInt();
        
        System.out.print("Enter the original heating time: ");
        double heating_time = scanner.nextDouble();
        
        double recommended_time;
        
        switch (item) {
        	case 1:
        		recommended_time = heating_time;
        		break;
            case 2:
                recommended_time = heating_time + (0.5 * heating_time);
                break;
            case 3:
                recommended_time = heating_time * 2;
                break;
            default:
                recommended_time = 0;
                System.out.println("Heating more than 3 items at once is not recommended.");
                break;
        }
        
        System.out.println("Recommended heating time: " + recommended_time);
        scanner.close();
    }
}

