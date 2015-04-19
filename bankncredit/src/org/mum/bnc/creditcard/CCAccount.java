package org.mum.bnc.creditcard;

import java.util.Date;

import org.mum.bnc.framework.Account;

public abstract class CCAccount extends Account {

	private Date expireDate;
	private Double lastMonthBalance;

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Double getLastMonthBalance() {
		return lastMonthBalance;
	}

	public Double getTotalMonthlyCredit() {
		return null;
	}

	public Double getTotalMonthlyCharges() {
		return null;
	}

	public abstract Double getNewMonthlyBalance();

	public abstract Double getMonthlyAmountDue();

	public void notifyCustomer() {
		// TODO implementation
	}
}
