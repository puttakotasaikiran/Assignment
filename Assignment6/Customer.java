package Assignment6;

import java.util.Scanner;

public class Customer{
	
	private String custNo;
	private String custName;
	private String category;
	  

	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}


	public String getCustName() {
		return custName;
	}

	public String getCategory() {
		return category;
	}

	public Customer(String custNo, String custName, String category) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.category = category;
	}
	
}