package org.mum.bnc.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class Account implements IAccount {

	private String accountNumber;
	private List<IEntry> entryList;
//	private ICustomer customer;

	public Account() {
		super();	
		this.entryList = new ArrayList<>();
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getBalance() {
		return 0.0;

	}

	public void addEntry(IEntry iEntry) {
		entryList.add(iEntry);
	}

	public abstract void notifyCustomer();
}
