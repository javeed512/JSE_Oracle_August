package lambda.expression;

@FunctionalInterface
public interface MyInterface {
	
	
		public abstract int add(int a,int b);
		
		
		public static void methodOne() {
			
			System.out.println("static method from MyInterface");
			
		}
		
		public default void methodTwo() {
			
			System.out.println("methodTwo default method from MyInterface");
		}

}
