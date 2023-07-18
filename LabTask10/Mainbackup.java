	public class Mainbackup {
		static void add(Plant [] plants, Plant p) {
		int count=0;
		for(int i=0;i<plants.length;i++) {
			if(plants[i]!=null)
			count++;
		}
		Plant [] temp = new Plant[count+1];
		for(int i=0;i<count;i++) {
			temp[i] = plants[i];
		}
		temp[count]=p;
		for(int i=0;i<temp.length;i++) {
			plants[i] = temp[i];
			System.out.println(temp[i]);
		}
	}
	static void remove(Plant [] plants, String n) {
		Plant [] temp = new Plant[plants.length-1];
		int count=0;
		int counter=0;
		for(int i=0;i<plants.length;i++) {
			if(plants[i]!=null)
			counter++;
		}
		for(int i=0;i<counter;i++) {
			String name = plants[i].getColor();
			if(name.equals(n)) {
				continue;
			}
			else {
				temp[count] = plants[i];
				++count;
			}
		}
		for(int i=0;i<plants.length;i++) {
			plants[i]=null;
		}
		for(int i=0;i<count;i++) {
			plants[i]=temp[i];
			System.out.println(plants[i]);
		}
	}
	static Plant search(Plant [] plants, String n) {
		int count=0;
		for(int i=0;i<plants.length;i++) {
			if(plants[i]!=null)
			count++;
		}
		Plant plnt = new Plant();
		for(int i=0;i<count;i++) {
			String name = plants[i].getColor();
			if(name.equals(n)) {
				plnt = plants[i];
			}
		}
		return plnt;
	}
	static void display(Plant [] plants) {
		int count=0;
		for(int i=0;i<plants.length;i++) {
			if(plants[i]!=null)
			count++;
		}
		for(int i=0;i<count;i++) {
			System.out.println(plants[i]);
		}
	}
	public static void main(String[] args) {
		Plant [] p = new Plant[100];
		p[0] = new Flower("Flower","White",true,true);
		p[1] = new Herb("Flower2","Black",true,"Spring");
		p[2] = new Plant("Flower3","Green");
		
		Plant plnt = new Flower("Flower4", "Orange",false,true);
		Plant pln = search(p,"Black");
		System.out.println(pln);
		System.out.println();
		add(p,plnt);
		System.out.println();
		remove(p,"Green");
		System.out.println();
		display(p);
	}
}
