package inheritance;

public class Review {

	public static void main(String[] args) {
		String s= "HELLO";
		String s1="World";
		System.out.println(s.concat(s1));
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s.toUpperCase());
		StringBuilder d = new StringBuilder("HELLO WORLD");
		System.out.println(d.insert(5," DEAR"));
		System.out.println(d.append("....."));
		System.out.println(d.delete(12, 19));
		System.out.println(d.reverse());

	}

}
