package met.tns.challenge;
import java.util.*;
//Ask the customer's age and for the time on a 24-hour clock (where noon is 12.00 and 4:30 PM is 16.30).
//The show timings are 10.15, 13.30, 18.00 and 22.00. The normal adult ticket price is $8.00, 
//however, the adult matinee price is $5.00. Adults are those over 13 years.
//The normal children's ticket price is $4.00, however, the children's matinee price is $2.00.
//Write a program that determines the price of a movie ticket

//Sample Input:
//
//Sample Output:
//
//16
//
//10.15
//public class Challenge {
//	
//	public static void ticketPrice(int age,String time) {
////		String time1= 0;
//		switch(time) {
//		case "10.15":
//			if(age>13) {
//				System.out.println("The Ticket price is: $8");
//			}
//			else {
//				System.out.println("The Ticket price is: $4");
//			}
//			break;
//		case "13.30":
//			if(age>13) {
//				System.out.println("The Ticket price is: $4");
//			}
//			else {
//				System.out.println("The Ticket price is: $2");
//			}
//			break;
//		case "18.00":
//			if(age>13) {
//				System.out.println("The Ticket price is: $8");
//			}
//			else {
//				System.out.println("The Ticket price is: $4");
//			}
//			break;
//		case "22.00":
//			if(age>13) {
//				System.out.println("The Ticket price is: $8");
//			}
//			else {
//				System.out.println("The Ticket price is: $4");
//			}
//			break;
//		default:
//			System.out.println("Enter a valid time");
//			
//		}
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		sc.nextLine();
//		String time = sc.next();
//		ticketPrice(age,time);
//
//	}
//
//}


public class Challenge{
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("TimeSlot:");
		double time = sc.nextDouble();
//		if(age>13 && time>10.15 && time<16.00) {
//			System.out.println("The price of the ticket will be: $5");
//		}
//		else {
//			System.out.println("The price of the ticket will be: $8");
//		}
//		if(age<13 && time>10.15 && time<16.00) {
//			System.out.println("The price of the ticket will be: $2");
//		}
//		else {
//			System.out.println("The price of the ticket will be: $4");
//		}
		//System.out.println("Enter time from 10.15, 13.30, 18.00, 22.00:-");
		if(age>13) {
			if(time>12.00 && time<16.00) {
				System.out.println("The price of the ticket will be: $5");
			}
			else {
				System.out.println("The Price of the ticket will be: $8");
			}
		}
		else {
				if(time>12.00 && time<16.00) {
					System.out.println("The price of the ticket will be: $2");
				}
				else {
					System.out.println("The Price of the ticket will be: $4");
				}
			}
		}
	}

