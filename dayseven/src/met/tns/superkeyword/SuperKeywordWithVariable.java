package met.tns.superkeyword;
//parent class
class State{
	String statename="Punjab";
	//String capital = "Panaji";
}
//child class
class Capital extends State{
	String statename = "Haryana";
	String capital="Chandigarh";
	
	public void display() {
		//super keyword with variable is used to call parent class variable if and only if parent and child class 
		//variable are same
		System.out.println(super.statename);//punjab
		String statename = "Haryana";//haryana
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Capital c= new Capital();
		c.display();

	}

}
