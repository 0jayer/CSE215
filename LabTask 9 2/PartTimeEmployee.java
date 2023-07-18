
public class PartTimeEmployee extends Employee {
	private double hour;
	private double rate;
	
	public PartTimeEmployee(String name,int age,String address,String department,String designation,double hour,double rate) {
		super(name,age,address,department,designation);
		this.hour=hour;
		this.rate=rate;
	}
	public double getHour() {
		return this.hour;
	}
	public double getRate() {
		return this.rate;
	}
	public void setHour(double hour){
		this.hour=hour;
		}
	public void setRate(double rate) {
		this.rate=rate;
	}
	public double salary() {
		return (this.hour*this.rate);
	}
	
	public String toString() {
		return("Salary is: " + salary());
	}
}
