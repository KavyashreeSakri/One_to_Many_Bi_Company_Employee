package one_to_many_bi_company_employee.controller;

import java.util.ArrayList;
import java.util.List;

import one_to_many_bi_company_employee.dao.EmployeeDao;
import one_to_many_bi_company_employee.dto.Company;
import one_to_many_bi_company_employee.dto.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Company company= new Company();
		company.setId(1002);
		company.setName("TestYantra");
		company.setGst("ABC123");
		
		Employee employee1= new Employee();
		employee1.setId(4);
		employee1.setName("Kavya");
		employee1.setPhone(741852);
		
		Employee employee2= new Employee();
		employee2.setId(5);
		employee2.setName("hema");
		employee2.setPhone(7485296);
		
		Employee employee3= new Employee();
		employee3.setId(6);
		employee3.setName("Sagar");
		employee3.setPhone(701984);
		
		List<Employee> emplist= new ArrayList<Employee>();
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		
		company.setEmployee(emplist);
		employee1.setCompany(company);
		employee2.setCompany(company);
		employee3.setCompany(company);
		
		EmployeeDao empDao= new EmployeeDao();
		empDao.saveEmployee(1002,employee1);
		empDao.saveEmployee(1002,employee2);
		empDao.saveEmployee(1002,employee3);
		
	}

}
