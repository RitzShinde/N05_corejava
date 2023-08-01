//program to demonstrate on access modifiers----------------------------------
package met.tns.accessspecifier;

public class Bank {
	
	//different access specifier
	public String bankName;
	private int pinNo;
	long accountNo=568956487956l;
	
	public void displayPublic(){
		System.out.println("Bank Name is:"+ bankName);
		
	}
	
	//private method
	private void displayPrivate() {
		System.out.println("Pin no. is:"+ pinNo);
	}
	
	//default method
	void defaultmethod() {
		System.out.println("Account No. is:"+ accountNo);
	}
	

}
