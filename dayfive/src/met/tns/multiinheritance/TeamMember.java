package met.tns.multiinheritance;
//child class1
public class TeamMember extends TeamLead{
	private int size;
	private int duration;
	
	//getters and setters
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//parameterized constructor-----------------
	public TeamMember(String deptName, String name, int empId, String leadName, int empId1, String projectName, int size, int duration) {
		super(deptName, name, empId, leadName, empId1, projectName);
		// TODO Auto-generated constructor stub
		this.size=size;
		this.duration=duration;
	}
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
