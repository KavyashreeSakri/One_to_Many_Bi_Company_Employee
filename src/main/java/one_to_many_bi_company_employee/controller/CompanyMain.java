package one_to_many_bi_company_employee.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import one_to_many_bi_company_employee.dto.Company;

public class CompanyMain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.find(Company.class, 1001);
		entityManager.find(Company.class, 1001);

	}
}
