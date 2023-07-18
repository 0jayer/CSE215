
public class Main {

	public static void main(String[] args) {
		PartTimeEmployee p =new PartTimeEmployee("Ahnaf",21,"Home","Delivery","Delivery Boy",10.00,5.00);
		FullTimeEmployee f = new FullTimeEmployee("Ojayer",22,"Home","Management","Manager",15000.00,25);
		System.out.println(p.salary());
		System.out.println(f.salary());

	}

}
