
public class Faculty extends Employee{
		private String initial;
		private String rank;
		
		public Faculty(String name, String gender, int age, String id, String department, double salary,String initial,String rank) {
			super(name,gender,age,id,department,salary);
			this.initial=initial;
			this.rank=rank;
		}
		public String getInitial() {
			return this.initial;
		}
		public String getRank() {
			return this.rank;
		}
		public void setInitial(String initial) {
			this.initial=initial;
		}
		public void setRank(String rank) {
			this.rank=rank;
		
		}
		
		public String toString() {
			return("Name: "+super.getName()+"\nAge: "+super.getAge()+"\nSalary: "+super.getSalary()+"\nInitial: "+this.initial);
		}
		
		
		
		
		
		
		
		
		
		
}
