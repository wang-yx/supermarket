package com.wgl.supermarket.customer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.wgl.supermarket.customer.dao.CustomerDao;
import com.wgl.supermarket.customer.service.CustomerService;
import com.wgl.supermarket.domain.Customer;

@Service("customerService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	@Override
	public void saveCustomer(Customer customer) {
		this.customerDao.save(customer);
	}

}
