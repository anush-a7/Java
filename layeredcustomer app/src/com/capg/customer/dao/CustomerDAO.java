package com.capg.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.capg.customer.bean.Cust;
import com.capg.customer.service.ICustomerService;

public class CustomerDAO implements ICustomerDAO {
	Connection conn = DBUtil.getDBConnection();

	@Override
	public int addCustomer(Cust c) {
		int count =0;
		try {
			PreparedStatement  pstmt= conn.prepareStatement(IQueryMapper.INSERT_CUST_QUERY);
			pstmt.setInt(1,c.getCid());
			pstmt.setString(2,c.getName());
			pstmt.setDouble(3,c.getAmount());
			pstmt.setString(4,c.getDop());
			count=pstmt.executeUpdate();
			System.out.println("CUSTOMER ADDED");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int updateCustome(Cust c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cust getCustomerByCid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteCustomerByCid(int Cid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Cust> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
