package met.tns.accessspecifierdayone;

import met.tns.accessspecifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.bankName = "SBI";
		b.displayPublic();
		
		/*pinNo and displayPrivate() methods are private, thats why we cannot access into another class and another package
		only we can access private data members inside same class*/
		
		//b.pinNo;
		//b.displayPrivate();
		
		/*accountNo and displayDefault() method are default thats why, we are not able to access into another package,
		 * only we can access within the same package*/
		
//		b.accountNo;
//		b.displayDefault();
		

	}

}
