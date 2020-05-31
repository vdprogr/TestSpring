package com.vdprog.core;

public class Client {

	private int ID;
	private String fullName;
	
	public Client(String s1, String s2) {
		this.ID = Integer.parseInt(s1);
		this.fullName = s2;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
}
