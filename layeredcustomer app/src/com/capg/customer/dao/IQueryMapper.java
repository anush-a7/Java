package com.capg.customer.dao;

public interface IQueryMapper {
	String INSERT_CUST_QUERY = "insert into customer values(?,?,?,TO_DATE(?,'dd,mm,yyyy'))"; 

}
