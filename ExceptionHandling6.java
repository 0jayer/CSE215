class AgeException extends Exception{
	
	public AgeException(String s) {
		super(s);
	}
}
class Example{
	void check(int age)throws AgeException{
		if(age>100){
			throw new AgeException("Invalid");
		}
		else {
			System.out.println("Valid");
		}
	}
}
public class ExceptionHandling6 {
	
	public static void main(String[] args) {
		Example obj = new Example();
		
		try {
			obj.check(40);
		}
		catch(AgeException e) {
			System.out.println("Caught the exception!");
			System.out.println(e.getMessage());
		}

	}

}
