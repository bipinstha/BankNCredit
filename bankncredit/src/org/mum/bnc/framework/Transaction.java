package org.mum.bnc.framework;

import java.util.Date;

public abstract class Transaction implements IEntry {

	private Double account;

	private Date entryDate;

	public Double getAccount() {
		return account;
	}

	public void setAccount(Double account) {
		this.account = account;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public abstract void execute();
}
