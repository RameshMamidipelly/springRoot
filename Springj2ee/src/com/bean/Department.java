package com.bean;

public class Department {
	private String name;
	private int did;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", did=" + did + "]";
	}
	

}