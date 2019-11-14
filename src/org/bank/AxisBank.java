package org.bank;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("this is a deposite account is Axis bank");

	}
	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.savings();
		ab.deposit();
		ab.fixed();
	}

}
