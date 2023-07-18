
public class ExceptionHandling2 {
	public static void main(String[] args) {
		
		
		try {
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds!");
		}
		catch(Exception e) {
			System.out.println("Error!");
		}
		finally {
			System.out.println("finally block");
		}
	}
}
