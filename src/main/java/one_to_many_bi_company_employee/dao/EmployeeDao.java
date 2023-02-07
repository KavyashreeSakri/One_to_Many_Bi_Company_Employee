package one_to_many_bi_company_employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_many_bi_company_employee.dto.Company;
import one_to_many_bi_company_employee.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}

	public void saveEmployee(int id,Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Company company= entityManager.find(Company.class, id);
		employee.setCompany(company);
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		System.out.println("Saved successfully...");
	}

	public void updateEmployee(int id, Employee employee) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee1 = entityManager.find(Employee.class, id);
		if (employee1 != null) {
			employee.setId(id);
			
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
			System.out.println("Updated successfully...");
		} else
			System.out.println(" Employee doesn't exists");
	}

	public void deleteEmployee(int id) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee1 = entityManager.find(Employee.class, id);
		
		entityTransaction.begin();
		entityManager.remove(employee1);
		entityTransaction.commit();
		System.out.println("deleted successfully");
	}
	public void getEmployeeById(int id)
	{
		EntityManager entityManager = getEntityManager();
		Employee employee1 = entityManager.find(Employee.class, id);
		System.out.println(employee1);
	}
	public void getAllEmployee()
	{
		EntityManager entityManager = getEntityManager();
		Query query= entityManager.createQuery("SELECT e FROM Employee e");
		List<Employee> list= query.getResultList();
		System.out.println(list);
	}
}
