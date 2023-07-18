
public class ExceptionHandling3 {

	public static void main(String[] args) {
		try{
			String str=null;
			System.out.println(str.length());
		}
		
		catch(ArithmeticException e){
			System.out.println("You should not divide a number by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds!");
		}
		
		catch(NullPointerException e){
			System.out.println("Null Pointer String!");
		}
		
		catch(Exception e) {
			System.out.println("Error!");
		}
		finally {
			System.out.println("finally block");
		}

	}

}
