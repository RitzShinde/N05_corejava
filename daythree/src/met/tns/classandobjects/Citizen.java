//Program to demonstrate on Default and Parameterized constructor-----------------------
package met.tns.classandobjects;

public class Citizen {
	//data members
	String citizenType;
	long aadharCard;
	String gender;
	String city;
	
	//default constructor
	public Citizen(){
		System.out.println("Demonstration on default Constructor");
	}
	
    //Parameterized Constructor
	public Citizen(String citizenType, long aadharCard, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharCard = aadharCard;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharCard=" + aadharCard + ", gender=" + gender + ", city="
				+ city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
