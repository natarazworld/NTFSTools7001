package com.nt.upi;

public class UPIPaymentOperations {
	
	//Performs the UPI Payment
	public  String  doPayment(long phNo,double amount) {
		
		// perform UPI Payment
		return  amount+" amount is paid to @phone number ::"+phNo;
		
		
	}

}
