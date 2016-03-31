package com.wgl.supermarket.test;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

public class TestHiberbate {
	SessionFactory sessionFactory = null;
	Session session = null;
	@Before
	public void setUp() throws Exception {
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();
	}

	@Test
	public void test() {
		List list = session.createQuery("from Customer").list();
		System.out.println(list);
	}

}
