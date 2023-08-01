package met.tns.singleinheritance;
//Derived Class--------------------------------
public class Student extends Citizen {
	
	private String collegeName;
	private int rollNo;
//	public Student() {
//		System.out.println("Child Class-Default Constructor");
//	}
	public Student() {
		super();    //Calls to parent class default constructor----------------
		System.out.println("Child Class- Default Constructor");
		// TODO Auto-generated constructor stub
	}
	public Student(String city, int pincode, long aadharNo, long contactNo, int rollNo, String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		// TODO Auto-generated constructor stub
		this.collegeName = collegeName;
		this.rollNo= rollNo;
		
		
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [collegeName=" + collegeName + ", rollNo=" + rollNo + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
