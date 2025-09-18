package aggregation;

public class AggregateChild {

	String city;
	String state;
	Aggregation ref;
	
	public AggregateChild(String city, String state, Aggregation ref ) {
		this.ref=ref;
		this.city=city;
		this.state=state;
	}
	public void display()
	{
		System.out.println(ref.name+" "+ref.rollno+" "+city+" "+ state);
	}
	public static void main(String[] args) {
		Aggregation obj =new Aggregation("Yedu",25);
		AggregateChild obj1=new AggregateChild("ALPY","KERALA",obj);
		obj1.display();

	}

}
