package inheritance;

public class RuntimePoly2 {

	public static void main(String[] args) {


		Object o  = new Object();
		
		Parent p = new Parent();
		
		Child  c   = new Child();
		
		Object o1  = new Parent(); 
		
		Parent p1 = new Child();  // runtime polymorphism
		
	//	Child  c1 = (Child)  new Parent();  // invalid
		
		
				p1.m1();
		
	}

}
