package com.capg.customer.ui;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

import com.capg.customer.bean.Cust;
import com.capg.customer.service.CustomerService;
import com.capg.customer.service.ICustomerService;

public class Client {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ICustomerService service = new CustomerService();
		while (true) {
			System.out.println("Customer managment service");
			System.out.println("1.Add Customer Details");
			System.out.println("2.Delete Customer Details");
			System.out.println("3.Select Customer Details");
			System.out.println("4.Select All Customer Datils");
			System.out.println("5.THANK YOU FOR UTILISING OUR SERVICES");
			int option = scan.nextInt();
			switch (option) {

			case 1:
				System.out.println("Enter NAME of the Customer");
				String name = scan.next();
				System.out.println("Enter ID of the Customer");
				int cid = scan.nextInt();
				System.out.println("Enter AMOUNT of the Customer");
				int amount = scan.nextInt();
				System.out.println("Enter DOP of the Customer");
				String dop = scan.next();
				// new Date(2020,03,19);
				// localDate dop = LocalDate.of(); //sys+1, -1 for yesterdays or tomorrow's date

				Cust customerBean = new Cust();
				customerBean.setCid(cid);
				customerBean.setName(name);
				customerBean.setAmount(amount);
				customerBean.setDop(dop);
				
			boolean isvalid=	CustomerService.userValidations(customerBean);
			if(isvalid) {
			int count =	service.addCustomer(customerBean);
				System.out.println(count);
			}
				
				
				
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;

			default:
				break;
			}

		}
	}

}
