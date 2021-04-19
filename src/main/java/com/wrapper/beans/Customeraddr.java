package com.wrapper.beans;

public class Customeraddr {
	
	private String id;
	private String address;
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customeraddr() {}
	
	public Customeraddr(String id, String address, String email) {
		
		this.id = id;
		this.address = address;
		this.email = email;
	}
	
}
