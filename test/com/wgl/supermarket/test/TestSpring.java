package com.wgl.supermarket.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wgl.supermarket.customer.service.CustomerService;
import com.wgl.supermarket.domain.Customer;
import com.wgl.supermarket.test.service.TestService;

public class TestSpring {
	ApplicationContext ac = null;
	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
//	@Test
//	public void test() {
//		TestDao testDao = (TestDao) ac.getBean("testDaoImpl");
//		testDao.sayHello();
//	}
	
//	@Test
//	public void testTransaction(){
//		TestService testService = (TestService) ac.getBean("testService");
//		testService.add();
//	}
	
	@Test
	public void testService(){
		CustomerService customerService = (CustomerService) ac.getBean("customerService");
		Customer customer = new Customer();
		customer.setCustomerName("小拜年");
		customer.setAddress("阿萨德回家啊闪光灯");
		customer.setAvailable(1);
		customer.setConnectionPerson("小明");
		customer.setEmail("1111@qq.com");
		customer.setPhone("12333343");
		customer.setTelephone("3234234");
		customer.setZip("13234");
		customerService.saveCustomer(customer);
	}
}
