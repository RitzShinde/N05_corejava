package met.tns.superkeyword;


public class StaticBlockExecutor {
	
	static float salary;
	String companyName;
	
	//static block is used to initialize the static vaariable....we cant assign a value for any non-static variable
	//inside the static block
	static {
		//companyname="Accenture";
		salary=57755.5f;
	}
	
	static void print() {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}

}
