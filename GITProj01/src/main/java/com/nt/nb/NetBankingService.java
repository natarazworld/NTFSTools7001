package com.nt.nb;

public class NetBankingService {
	
	
	// By deafault performs RTGS  payment
	public  String  transferMoney(long srcAccount, long destAccount, String ifscCode, double amount) {
		return  amount+"  is transfering from "+srcAccount+ " to   "+destAccount;
	}

}
