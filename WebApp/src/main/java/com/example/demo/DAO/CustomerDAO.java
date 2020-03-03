package com.example.demo.DAO;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.Model.CustomerModel;

public interface CustomerDAO {

public boolean verify(String username,String passWord) throws SQLException ;
	
	public int addUser(CustomerModel cust) ;
	
	public  boolean changeAddress(int custId,Object object) ;
	
	public boolean addtoCustomerGroup(int custId,int groupId) ;
	
	public CustomerModel getCustomerDetails(int custId) ;

}
