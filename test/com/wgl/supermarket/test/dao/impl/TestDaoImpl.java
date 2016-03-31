package com.wgl.supermarket.test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.test.dao.TestDao;
import com.wgl.supermarket.test.domain.Customer;

@Repository("testDao")
public class TestDaoImpl implements TestDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void sayHello() {
		Session session = sessionFactory.openSession();
		List list = session.createQuery("from Customer").list();
		System.out.println(list);
		session.close();
		sessionFactory.close();
	}

	@Override
	public void saveHello() {
//		Session session = sessionFactory.openSession();
		Session session = sessionFactory.getCurrentSession();
//		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerName("小拜年");
		customer.setAddress("阿萨德回家啊闪光灯");
		customer.setAvailable(1);
		customer.setConnectionPerson("小明");
		customer.setEmail("1111@qq.com");
		customer.setPhone("12333343");
		customer.setTelephone("3234234");
		customer.setZip("13234");
//		transaction.begin();
		session.save(customer);
//		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
