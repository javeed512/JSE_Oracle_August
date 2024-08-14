package com.oracle.atm;

import java.util.Scanner;

/*
 * @Author: Vidhya
 * Desp:ATM UI for end user
 * 
 */

public class AtmUI {

	public static void main(String[] args) {

			boolean flag = true;
			
			Scanner scanner = new Scanner(System.in);
			
			IBank bank = BankUtil.getBankObject(); // pure abstraction
			
			while (flag) {
				System.out.println("********WELCOME TO SBI ATM*********");
				System.out.println("1. Deposit");
				System.out.println("2. Witdraw");
				System.out.println("3. Exit");

				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
							// deposit
							bank.deposit();
							
					break;
				case 2:
							// withdraw
							bank.withdraw();
							
					break;

				case 3:
							// exit
						System.out.println("Thank You visit again");
							flag = false;
					
					break;

				default:
						System.err.println("Invalid Option");
					
					break;
				}

			
		
			}
		
	}

}
