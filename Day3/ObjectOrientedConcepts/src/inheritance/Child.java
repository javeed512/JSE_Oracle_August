package inheritance;

public class Child extends Parent {

	int cid = 99;

	public Child() {
		super(); // Parent();

		System.out.println("Child() is called object is created..");

	}

	public Child(int cid) {  // constructor overloading
		super();
		this.cid = cid;
	}

	public void m2() {

		System.out.println("m2() from Child class");
	}
	
	public  void m2(String name) {  // method overloading
		
		System.out.println("Hello "+name);
		
	}
	
	
	// overriding m1() from Parent class
	@Override
	public void  m1() {
		
		
		System.out.println("m1() called from Child class....");
	}
	

	public static void main(String[] args) {

		Parent p = new Parent();

		p.m1();

		System.out.println(p.toString());

		Child c = new Child();

		c.m2();
		c.m1();
		System.out.println(c.toString());

		// System.out.println(c instanceof Child);
		
		
			System.out.println("3" + "4");
		

	}
	
		@Override
		public String toString() {
			
			return "ToString from child class";
			
		}
	

}
