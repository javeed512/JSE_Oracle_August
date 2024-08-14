package inheritance;

public class Parent extends Object {

	int pid = 100;

	public Parent() {
		super(); // Object();

		// super.toString();

		System.out.println("Parent() called object created...");

	}

	public void m1() {

		System.out.println("m1() from Parent class");
	}

}
