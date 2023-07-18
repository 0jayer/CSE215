
public class Person {
	private String name;
	private String gender;
	private int age;
	public Person(String name,String gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public String getGender() {
		return this.gender;
	}
	public int getAge() {
		return this.age;
				
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String toString() {
		return ("Name is " +this.name + "\nGender is : " + this.gender + "\nAge is : "+this.age);
	}
	
	
}
