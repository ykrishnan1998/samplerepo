package inheritance;

public class SingleChild  extends SingleParent {

	public void Print() {
		System.out.println("This is Child class");
	}
	public static void main(String[] args) {
		SingleChild obj = new SingleChild();
		obj.display();
		obj.Print();
		
	}

}
