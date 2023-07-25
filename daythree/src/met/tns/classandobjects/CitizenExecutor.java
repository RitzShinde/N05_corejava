//Driver
package met.tns.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c = new Citizen();
//		c.aadharCard = 614979008964l;
//		c.citizenType = "Adult";
//		c.gender = "Male";
//		c.city = "Nashik";
		
		Citizen c1 = new Citizen("Adult",614979008964l,"Male","Nashik");
		System.out.println(c1);

	}

}
