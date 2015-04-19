package org.mum.bnc.framework;

import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer {

	private String name;
	private String street;
	private String city;
	private String state;
	private Long zip;
	private String email;
	private List<IAccount> accounts;

	public Customer(String name, String street, String city, String state,
			Long zip, String email) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
		accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void addAccount(IAccount iAccount) {
		accounts.add(iAccount);

	}

	@Override
	public void removeAccount(IAccount iAccount) {
		accounts.remove(iAccount);

	}

	@Override
	public List<IAccount> getAllAccount() {
		return this.accounts;
	}

	@Override
	public void sendEmail() {
		// TODO Auto-generated method stub

	}

}
