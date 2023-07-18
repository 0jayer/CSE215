
public class ExceptionHandling4 {

	public static void main(String[] args) {
		try{
			System.out.print("Result: ");
			int num = 45/0;
			System.out.println(num);
		}
		
		catch(Exception e) {
			System.out.println("Error!");
		}
		
		finally {
			System.out.println("finally block");
		}

	}

}
