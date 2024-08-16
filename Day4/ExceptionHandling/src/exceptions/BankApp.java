package exceptions;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int acno[] = { 101, 102, 103, 104, 105 };
		String names[] = { "king", "tom", "smith", "ford", "satis" };

		double balance[] = { 5000, 6000, 70, 8000,  12000 };

		System.out.println("ACNO NAME BALANCE");

		for (int i = 0; i < acno.length; i++) {

			System.out.println(acno[i] + " " + names[i] + "  " + balance[i]);
			
			if(balance[i] < 1000) {
				
				try {
				throw  new LowBalanceException();  //User defined exp raised
				}
				catch (LowBalanceException e) {
						
					System.err.println(names[i]+" Balance is low please deposit some amount");

				}
			}
			
			

		}
		
		
		
	}

}
