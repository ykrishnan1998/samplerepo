package polymorphism;

public class PolyChildClass  extends PolyParentClass{

	public void display(int a , int b)
	{
		super.display(3, 5);
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		
		PolyChildClass s =new PolyChildClass();
		s.display(1,3);
			
	}

}
