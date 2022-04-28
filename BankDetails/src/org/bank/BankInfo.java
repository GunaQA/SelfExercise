package org.bank;

public class BankInfo extends AxisBank {
	public void savings() {
		System.out.println("Savings Int is 3.5%");
	}
	public void fixed() {
		System.out.println("Fixed Int is 6.5%");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.savings();
		b.fixed();
		b.deposit();
	}

}
