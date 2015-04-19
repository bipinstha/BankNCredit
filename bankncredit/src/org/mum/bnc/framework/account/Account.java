package org.mum.bnc.framework.account;

import java.util.ArrayList;
import java.util.List;

import org.mum.bnc.framework.IAccount;
import org.mum.bnc.framework.ICustomer;
import org.mum.bnc.framework.IEntry;

public abstract class Account implements IAccount {

	private String accountNumber;
	private List<IEntry> entryList;
	private ICustomer customer;

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
