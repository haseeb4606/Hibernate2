package com.hibernate.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.hibernate.entities.*;

public class ClientRepository {

	private SessionFactory sessionfactory;

	public void save(ClientEntity emp) {
		
		Session session = sessionfactory.openSession();

		session.beginTransaction();
		session.save(emp);

		session.getTransaction().commit();
		session.close();
	}

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

}
