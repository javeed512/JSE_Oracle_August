package arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int a1[] = {21,45,23,88,76,43,11};
		
		int a2[] = new int[4];
			a2[0] = 99;
		
			for (int i = 0; i < a2.length; i++) {
				System.out.println(a2[i]);
			}
			
			for (int n : a1) {
				
				System.out.println(n);
			}
			
			
			
			
		

	}

}
