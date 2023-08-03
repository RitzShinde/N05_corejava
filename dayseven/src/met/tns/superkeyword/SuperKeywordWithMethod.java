package met.tns.superkeyword;
//METHOD EXAMPLE-------------------------------WITH SUPER KEYWORD------------
//parent class
class Sports{
	String sportsName = "Hockey";
	void display() {
		System.out.println("Sports name is:"+ sportsName);
	}
}
//child class
class Cricket extends Sports{
	int noOfPlayers=11;
	void display() {
		//IF parent and Child class methods are same and if we want to call the parent class method inside the
		//child class then use super.methodname();
		super.display();
		System.out.println("No. of players are:"+noOfPlayers);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
		c.display();
		

	}

}
