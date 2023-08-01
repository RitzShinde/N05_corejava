package met.tns.multiinheritance;
//child class2
//parent class2
public class TeamLead extends Manager{
	private String leadName;
	private int empId;
	private String projectName;
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
//	public TeamLead(String leadName, int empId, String projectName) {
//		super();
//		this.leadName = leadName;
//		this.empId = empId;
//		this.projectName = projectName;
//	}
//	public TeamLead() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	//parameterized constructor---------------------
	public TeamLead(String deptName, String name, int empId, String leadName, int empId1, String projectName) {
		super(deptName, name, empId1);
		// TODO Auto-generated constructor stub
		this.empId = empId1;
		this.leadName = leadName;
		this.projectName = projectName;
	}
	
	
	

}
