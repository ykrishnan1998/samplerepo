package superkeyword;

public class SuperMethodChild extends SuperMethodParent{

	public void display1()
	{
		System.out.println("ITS CHILD CLASS");
		super.display();
	}
	public static void main(String[] args) {
		SuperMethodChild d =new SuperMethodChild();
		d.display1();
	}

}
