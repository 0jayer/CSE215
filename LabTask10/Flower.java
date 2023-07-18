
public class Flower extends Plant{
	private boolean hasSmell;
	private boolean hasThorn;
	public Flower() {
		
	}
	public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
		super(name, color);
		this.hasSmell=hasSmell;
		this.hasThorn=hasThorn;
	}
	public boolean getHasSmell() {
		return hasSmell;
	}
	public boolean getHasThorn() {
		return hasThorn;
	}
	public void setHasSmell(boolean hasSmell) {
		this.hasSmell=hasSmell;
	}
	public void setHasThorn(boolean hasThorn) {
		this.hasThorn=hasThorn;
	}
	public String toString() {
		return("This is a "+this.getName()+"\nColor: "+this.getColor()+"\nThis Flower has smell: "+this.hasSmell + "\nThis Flower has thorn: "+this.hasThorn+"\n");
	}
	
}
