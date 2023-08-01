package met.tns.challenges;

import java.util.Scanner;

/*Pratik is so much interested in gardening and hence he plants more trees in his garden.
 * He plants trees in a rectangular fashion with the order of rows and columns and numbers the trees in a row wise order.
 * He planted the mango tree only in the first row first column and last column.
 * So, given the tree number and rows and column. Your task is to find out whether the given tree is mango tree or not.
 * input n=5(n is rows and columns)    t=11(tree number)*/
public class MangoTreeExecutor {
	
	public static void isMangoTree(int n, int t) {
		if(t%n ==0 || t%n==1 || t<=n) {
			System.out.println("Mango Tree");
		}
		else {
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int t = sc.nextInt();
//		Tree = isMangoTree(5,11);
//		System.out.println(Tree+"Position is a Mango Tree");
		isMangoTree(n,t);
		
	}

}
