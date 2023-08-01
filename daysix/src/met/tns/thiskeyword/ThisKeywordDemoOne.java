package met.tns.thiskeyword;
//It can be used to refer the instance variable of the current class-----------------
public class ThisKeywordDemoOne {
	int x,y;
	void setData (int x, int y) {
		this.x = x;//we can change the parameters also
		this.y = y;
		
	}
	void display() {
		System.out.println(x+" "+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(2,3);
		t.display();
		

	}

}
