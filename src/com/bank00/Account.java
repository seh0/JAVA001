package com.bank00;

public class Account {
	private String id, pwd, name, address;
	private int cash;

	public Account() {
		super();
	}

	public Account(String id, String pwd, String name, String address, int cash) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
		this.cash = cash;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", name=" + name + ", address=" + address + ", cash=" + cash
				+ "]";
	}

}
