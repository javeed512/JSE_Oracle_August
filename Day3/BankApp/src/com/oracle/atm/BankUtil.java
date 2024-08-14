package com.oracle.atm;
/*
 * @author: javeed
 * utility class for all
 * 
 */
public class BankUtil {
	
	
	
	public static IBank getBankObject(){
		
		
		return new BankImp2();
		
	}
	

}
