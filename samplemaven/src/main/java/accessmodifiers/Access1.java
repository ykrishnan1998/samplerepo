package accessmodifiers;

public class Access1 {

	public void display()
	{
		System.out.println("PUBLIC");
	}
	private void display1()
	{
		System.out.println("PRIVATE");
	}
	protected void display2()
	{
		System.out.println("PROTECTED");
	}
	void display3()
	{
		System.out.println("DEFAULT");
	}
	public static void main(String[] args) {
		
		Access1 a =new Access1();
		a.display();
		a.display1();
		a.display2();
		a.display3();
	}

}
