package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {  // caller
		// TODO Auto-generated method stub
		
		
		System.out.println("Open File");
		System.out.println("Read Data ");
		
		int result = 0;
		
		String name = "javeed";
		
		try {
		
		 result =	div(10,2);
		 
		  System.out.println(name.length());
		  
		 // System.out.println(args[0]);
		}
		catch(ArithmeticException e) {
			
			System.err.println("Sorry can't divide number by zero");
			
			e.printStackTrace();
			
			
		}
		catch (NullPointerException e) {

				e.printStackTrace();

		}
		catch(Exception e) {
			
				e.printStackTrace();
			
		}
		
		finally {
			System.out.println("Close File");
			
		}
		
		
		System.out.println("Write Data ");
		System.out.println("Result :" +result);
		
		
		

	}
	
	public static int div(int a, int b)throws ArithmeticException {   //callee
		
		return a/b;   // new ArithmehticException();
		
	}
	
	

}
