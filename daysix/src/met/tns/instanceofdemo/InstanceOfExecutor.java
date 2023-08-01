package met.tns.instanceofdemo;
//program to demonstrate on instance of operator-----------------

class Flower{
	String name = "Rose";
}

class Rose extends Flower{
	String color = "Red";
}
public class InstanceOfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r = new Rose();
		if(r instanceof Flower) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
