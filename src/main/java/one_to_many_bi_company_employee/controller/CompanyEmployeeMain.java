package one_to_many_bi_company_employee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_many_bi_company_employee.dto.Company;
import one_to_many_bi_company_employee.dto.Employee;

public class CompanyEmployeeMain {

	public static void main(String[] args) {
//	Company company= new Company();
//	company.setId(1001);
//	company.setName("TestYantra");
//	company.setGst("ABC123");
//	
//	Employee employee1= new Employee();
//	employee1.setId(1);
//	employee1.setName("Kavya");
//	employee1.setPhone(741852);
//	
//	Employee employee2= new Employee();
//	employee2.setId(2);
//	employee2.setName("hema");
//	employee2.setPhone(7485296);
//	
//	Employee employee3= new Employee();
//	employee3.setId(3);
//	employee3.setName("Sagar");
//	employee3.setPhone(701984);
//	
//	List<Employee> emplist= new ArrayList<Employee>();
//	emplist.add(employee1);
//	emplist.add(employee2);
//	emplist.add(employee3);
//	
//	//to build relation
//	
//	company.setEmployee(emplist);
//	employee1.setCompany(company);
//	employee2.setCompany(company);
//	employee3.setCompany(company);
//	
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	EntityManager entityManager1= entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction= entityManager.getTransaction();
//	entityTransaction.begin();
//	
//	entityManager.persist(company);
//	entityManager.persist(employee1);
//	entityManager.persist(employee2);
//	entityManager.persist(employee3);
//	entityTransaction.commit();

//	entityManager.find(Company.class, 1002);
//	entityManager.find(Company.class, 1002);
	entityManager.find(Employee.class, 1);
	entityManager1.find(Employee.class, 1);
//	entityManager.find(Employee.class, 4);

	}

}
