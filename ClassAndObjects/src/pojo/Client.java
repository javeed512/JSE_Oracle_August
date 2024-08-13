package pojo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e1 = new Employee(101, "king", 90000);
		
		Employee e2 = new Employee(102,"tiger",60000);	
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println(e1.getEid());
		System.out.println(e1.getEname());
		
			//Employee e3 = new Employee(0, "varul", 0.0);
		
		Employee e3 = new Employee();
		
		e3.setEname("varul");
		
		System.out.println(e3.getEid() +" "+e3.getEname()+" "+e3.getSalary()  );
		
		
			
		System.out.println(e3);
		
		
		
		
		
		
		
		
		
	}

}
