package lambda.expression;

public class ImpDemo  implements MyInterface {

	

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return  a+b;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInterface  mi = 	new ImpDemo();
		
			int result =	mi.add(4, 5);
		
			System.out.println("Result : "+result);
	}
	
	

}
