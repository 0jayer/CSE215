
public class Employee extends Person {
		private String id;
		private String department;
		private double salary;
		public Employee(String name, String gender, int age, String id, String department, double salary) {
			super(name,gender,age);
			this.id=id;
			this.department=department;
			this.salary=salary;
		}
		public String getId() {
			return this.id;
		}
		public String getDepartment() {
			return this.department;
		} 
		public double getSalary() {
			return this.salary;
		}
		public void setId(String id) {
			this.id=id;
		}
		public void setDepartment(String department) {
			this.department=department;
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public String toString() {
			return ("Id is " +this.id + "\nDepartment is : " + this.department + "\nSalary is : "+this.salary);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		}
