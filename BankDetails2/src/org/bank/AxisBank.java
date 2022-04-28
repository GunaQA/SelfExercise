package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		System.out.println("Deposit int is 4%");
	}
	
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}
}
