//Program to demonstrate on encapsulation-----------------------------------
/*Encapsulation achieves the data hiding using private access specifiers*/

//driver class----------------
package met.tns.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h =new HDFC();
		h.setAccountNo(456897456324l);
		h.setAccountType("Current Account");
		h.setCvvNo(899);
		h.setPinNo(4658);
		
		//Accessing and printing all the private members--------------------
//		System.out.println(h.getAccountNo());
//		System.out.println(h.getCvvNo());
//		System.out.println(h.getPinNo());
//		System.out.println(h.getAccountType());
		
		System.out.println(h);
		

	}

}
