package met.tns.challenges;
import java.util.*;
/*Write a program to calculate the hotel tariff. The room rent is 12% high during peak seasons(April to june 
is a peak season 
 * and nov to dec is also a peak season) USe the switch cases
 * Sample Input----month=3, rent, day=how many days, calculate the room price*/


/* A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time and when heating 3 
 * items double the heating time. Heating more than 3 items in once is not recommended. WAP to find out recommended
 * heating time.  input  item=2 and heating time=5.0*/
//public class Assig {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
//		int rent = sc.nextInt();
//		int days = sc.nextInt();
//		if(month == 4 || month==5 || month==6 || month==11 || month==12) {
//			System.out.println("The price of the room will be:"+ (((12.0/100)*rent)+rent)*days);
//		}
//		else {
//			System.out.println("The price of the room will be:"+(rent*days));
//		}
//
//	}
//
//}

import java.util.Scanner;

public class Assig {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month ranging from 1-12: ");
        int month = scanner.nextInt();

        System.out.print("Enter the room rent per day: ");
        double rent = scanner.nextDouble();

        System.out.print("Enter the number of days you wanna stay: ");
        int days = scanner.nextInt();

        double totalTariff = 0;
        switch (month) {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totalTariff = (12.0/100)*rent+rent*days;
                break;
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
                totalTariff = rent * days;
                break;
            default:
            	System.out.println("Enter a valid Month");
        }

        System.out.println("Total tariff for the stay: " + totalTariff);
        scanner.close();
    }
}

