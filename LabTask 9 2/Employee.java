
public class Employee extends Person {
	String department;
	String designation;
	public Employee(String name,int age,String address,String department,String designation) {
		super(name,age,address);
		this.department=department;
		this.designation=designation;
	}
	
	public String getDepartment() {
		return this.department;
	}
	public String getDesignation() {
		return this.designation;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String toString() {
		return("Department: "+this.department+"\nDesignation:"+this.designation);
	}
}
