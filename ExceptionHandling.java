
public class ExceptionHandling {
	
		public static void main(String[] args) {
			int num1,num,result;
			
			try {
				num1=0;
				num=10;
				result=10/0;
				System.out.println(result);
				System.out.println("Done");
			}
			catch(ArithmeticException e){
				System.out.println("You should not divide a number by zero");
			}
			catch(Exception e) {
				System.out.println("Error!");
			}
			finally {
				System.out.println("finally block");
			}
		}
}
