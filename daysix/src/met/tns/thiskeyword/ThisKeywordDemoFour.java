package met.tns.thiskeyword;

public class ThisKeywordDemoFour {
	int x;
	//default constructor
	ThisKeywordDemoFour(){
		//invoking current parameterized constructor
		this(34);
		System.out.println("Default constructor");
	}
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("Parameterized constructor"+ x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoFour t = new ThisKeywordDemoFour();
		
		

	}

}
