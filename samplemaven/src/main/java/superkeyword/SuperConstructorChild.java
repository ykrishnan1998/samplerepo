package superkeyword;

public class SuperConstructorChild extends SuperConstructor {
	public SuperConstructorChild()
	{
		super(1,2);
		System.out.println("HELLW WORLD");
	}

	public static void main(String[] args) {
		SuperConstructorChild a =new SuperConstructorChild();

	}

}
