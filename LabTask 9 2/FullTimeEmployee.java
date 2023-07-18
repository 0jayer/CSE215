
public class FullTimeEmployee extends Employee {
	private double basic;
	private double allowance;
	
	public FullTimeEmployee(String name,int age,String address,String department,String designation,double basic,double allowance) {
		super(name,age,address,department,designation);
		this.basic=basic;
		this.allowance=allowance;
	}
	public double getBasic() {
		return this.basic;
	}
	public double getAllowance() {
		return this.allowance;
	}
	public void setBasic(double basic){
		this.basic=basic;
		}
	public void setAllowance(double allowance) {
		this.allowance=allowance;
	}
	
	public double salary() {
		return(this.basic+((this.allowance/100)*this.basic));
	}
	public String toString() {
		return("Salary is: "+salary());
	}
}
