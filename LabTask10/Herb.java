
public class Herb extends Plant{
	private boolean isMedicinal;
	private String season;
	public Herb() {
		
	}
	public Herb(String name, String color, boolean isMedicinal, String season) {
		super(name, color);
		this.isMedicinal = isMedicinal;
		this.season=season;
	}
	public boolean getIsMedicinal() {
		return isMedicinal;
	}
	public String getSeason() {
		return season;
	}
	public void setIsMedicinal(boolean isMedicinal) {
		this.isMedicinal=isMedicinal;
	}
	public void setSeason(String season) {
		this.season=season;
	}
	public String toString() {
		return("This is a "+this.getName()+"\nColor: "+this.getColor()+"\nThis Herb has medicinal benefits: "+this.isMedicinal + "\nThis Herb blooms in: "+this.season+"\n");
	}
}
