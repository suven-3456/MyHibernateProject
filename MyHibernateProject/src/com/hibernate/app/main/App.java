package com.hibernate.app.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {
public static void main(String[] args) {
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernatedb");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		System.out.println("BataBase conected.....");
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}
