package com.huhy.payroll;

public class Accounts {

	public void procesSalary(Employee employee) {
		
		if(employee!=null){
			
			if(employee instanceof ConfirmedEmployee){
				ConfirmedEmployee confirmedEmployee = (ConfirmedEmployee)employee;
				confirmedEmployee.transportfacility();
			}
			}
			
			employee.netSalary();

	}
}
