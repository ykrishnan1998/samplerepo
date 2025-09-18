package superkeyword;

public class SuperVariableChild  extends SuperVariable
{

	String s="Hariii";
	public void display()
	{
		System.out.println(s);
		System.out.println(super.s);
	}
	public static void main(String[] args) {
	

		SuperVariableChild a =new SuperVariableChild();
		a.display();
		
	}

}
