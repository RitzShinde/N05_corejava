package met.tns.multiinheritance;
//parent class----super class
public class Manager {
	//private datamambers
	private String deptName;
	private String name;
	private int empId;
	
	//default constructor
	public Manager() {
		System.out.println("Default constructor-Manager");
	}

	//parameterized constructor
	public Manager(String deptName, String name, int empId) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empId=" + empId + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	

}
