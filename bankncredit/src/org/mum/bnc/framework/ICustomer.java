package org.mum.bnc.framework;

import java.util.List;

public interface ICustomer {

	public void addAccount(IAccount iAccount);
	
	public void removeAccount(IAccount iAccount);
	
	public List<IAccount> getAllAccount();
	
	public void sendEmail();
}
