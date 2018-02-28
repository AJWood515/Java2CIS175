package beans;

import java.util.Date;

public class EmployeeInfo {

	private long id;
	private String employeeName;
	private double payRate;
	private String dateHired;
	
	public EmployeeInfo() {
		
	}
	public EmployeeInfo(long id, String employee, double pay, String hired) {
		this.id=id;
		this.employeeName = employee;
		this.payRate = pay;
		this.dateHired = hired;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	
}
