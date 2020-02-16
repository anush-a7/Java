package com.capg.customer.service;

import java.util.List;

import com.capg.customer.bean.Cust;

public interface ICustomerService {
	int addCustomer(Cust c);

	int updateCustome(Cust c);

	Cust getCustomerByCid(int cid);

	int deleteCustomerByCid(int Cid);

	List<Cust> getAllCustomers();

}
