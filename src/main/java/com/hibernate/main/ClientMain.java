package com.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hibernate.entities.ClientEntity;
import com.hibernate.repositories.ClientRepository;

public class ClientMain {
	
	public static void main(String[] args) {
		
	

		ApplicationContext apc = new ClassPathXmlApplicationContext("Hibernate2.xml");
		
		ClientRepository cl = (ClientRepository) apc.getBean("clientRepository");
		
		ClientEntity cli = new ClientEntity();
		cli.setFirstName("jawid");
		cli.setLastName("John");
		cli.setPosition("Cleaner");
		cli.setSalary(500);
		cl.save(cli);
		
		ClientEntity cli2 = new ClientEntity();
		cli2.setFirstName("Dawood");
		cli2.setLastName("Satari");
		cli2.setPosition("Finance");
		cli2.setSalary(3800);
		cl.save(cli2);
		
		
		
		ClientEntity cli3 = new ClientEntity();
		cli3.setFirstName("Michael");
		cli3.setLastName("Nava");
		cli3.setPosition("Driver");
		cli3.setSalary(1500);
		cl.save(cli3);
		
		ClientEntity cli4 = new ClientEntity();
		cli4.setFirstName("Nida");
		cli4.setLastName("Ahmadi");
		cli4.setPosition("Manager");
		cli4.setSalary(4100);
		cl.save(cli4);
		
		System.out.println(cli4.getId());
		
		
		
	}

}
