import java.util.ArrayList;

public class Examplestream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> ob = new ArrayList<String>();
		ob.add("Ishan");
		ob.add("Om");
		ob.add("Namah");
		ob.add("Shivaya");
		
		//ob.stream().filter(c->c.length()>4).forEach(a->System.out.println(a));
		ob.stream().filter(a->a.startsWith("I")).forEach(b->System.out.println(b));
	}

}
