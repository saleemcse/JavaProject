package com.huhy.payroll.main;

import com.huhy.payroll.Accounts;
import com.huhy.payroll.ConfirmedEmployee;
import com.huhy.payroll.ContractEmployee;
import com.huhy.payroll.Interns;

public class MainClass {
	public static void main(String[] args) {
		ConfirmedEmployee employee = new ConfirmedEmployee();
		
		Accounts accounts=new Accounts();
		
		accounts.procesSalary(employee);
		
	  Interns intern = new Interns();
	  
	  accounts.procesSalary(intern);
	  
	  ContractEmployee contractEmployee= new ContractEmployee();
	  
	  accounts.procesSalary(contractEmployee);
	}

}
