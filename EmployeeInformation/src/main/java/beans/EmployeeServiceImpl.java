package beans;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void changePayRate(long sourceEmployeeId, double amount) {
		EmployeeInfo sourceEmployee = employeeDao.find(sourceEmployeeId);
		sourceEmployee.setPayRate(sourceEmployee.getPayRate()+ amount);
		employeeDao.update(sourceEmployee);
	}

	public EmployeeInfo getEmployee(long employeeID) {
		return employeeDao.find(employeeID);
	}
	public void changePayRate(String string, double amount) {
		List<EmployeeInfo> sourceEmployee = employeeDao.find(string);
		((EmployeeInfo) sourceEmployee).setPayRate(((EmployeeInfo) sourceEmployee).getPayRate()+ amount);
		employeeDao.update(sourceEmployee);
		
	}
	public EmployeeInfo getEmployee(String string) {
		return (EmployeeInfo) employeeDao.find(string);
		
	}

	
}
