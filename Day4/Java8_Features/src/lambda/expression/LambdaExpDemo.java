package lambda.expression;

public class LambdaExpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			MyInterface mi =		(int a,int b)->{return a+b;};   //lambda exp
		
				int result =	mi.add(4, 4);
				
				System.out.println("Result : "+result);
				
		
	}

}
