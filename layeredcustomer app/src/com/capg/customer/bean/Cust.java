package com.capg.customer.bean;
import java.sql.Date;

public class Cust {

	private int cid;
	private String name;
	private double amount;
	private String dop;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDop() {
		return dop;
	}
	public void setDop(String dop) {
		this.dop = dop;
	}
	
	
	
	
}
