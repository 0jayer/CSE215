
public class ExceptionHandling5 {
		public static void check(int age) {
			if(age<18) {
				throw new ArithmeticException("Person is not eligible to vote");
			}
			else{
				System.out.println("Person is eligible to vote");
			}
		}
		
	public static void main(String[] args) {
		check(20);
		
		System.out.println("..............");
	}

}
