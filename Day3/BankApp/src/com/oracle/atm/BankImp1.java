package com.oracle.atm;


/*
 * @Author: varul
 * desp: BankImp1 class having only deposit business logic
 */

public abstract class BankImp1 implements IBank{

	@Override
	public void deposit() {

		System.out.println("Deposit success....");
		
		
		
	}

	public abstract void withdraw();
	

}
