package met.tns.looping;

//public class WhileLoop {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n = 20;
//		int i =1;
//		while(n<=i) {
//			System.out.println(n);
//			n--;
//		}
//
//	}
//
//}
//Program to count the total number of digits in a number-----------------------------------
public class WhileLoop{
	public static void main(String args[]) {
		int digit = 37475344;
		int count = 0;
		while(digit>0) {
			count++;
			digit = digit/10;
		}
		System.out.println("The Number of digits are:"+count);
	}
}
