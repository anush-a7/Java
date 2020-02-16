package com.capg.customer.service;

import java.util.List;

import com.capg.customer.bean.Cust;
import com.capg.customer.dao.CustomerDAO;
import com.capg.customer.dao.ICustomerDAO;

public class CustomerService implements ICustomerService {

	
	ICustomerDAO dao = new CustomerDAO();
	@Override
	public int addCustomer(Cust c) {
		
		return dao.addCustomer(c);
		
	}

	@Override
	public int updateCustome(Cust c) {
		

		return 0;
	}

	@Override
	public Cust getCustomerByCid(int cid) {

		return null;
	}

	@Override
	public int deleteCustomerByCid(int Cid) {

		return 0;
	}

	@Override
	public List<Cust> getAllCustomers() {

		return null;
	}

	public static boolean isvalidCid(int cid) {
		boolean flag = false;
		if (cid != 0 && (cid > 99 && cid < 1000)) {
		flag = true;

		}
		return flag;
	}

	public static boolean isValidName(String name) {
		boolean flag = false;
		if (name.length() >= 3) {
			flag = true;
		}
		return flag;

	}

	public static boolean userValidations(Cust c) {
		boolean flag;
		if (isvalidCid(c.getCid()) && isValidName(c.getName()))
			;
		{
			flag = true;

		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
