package encapsulation;

public class Encapsulation1 {

	private String name;
	private int age;
	
	public void Setter(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public void Getter() {
		System.out.println(name+" "+ age);
	}
}
