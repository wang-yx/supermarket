package com.wgl.supermarket.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.wgl.supermarket.test.dao.TestDao;
import com.wgl.supermarket.test.service.TestService;

@Service("testService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	@Override
	public void add() {
		this.testDao.saveHello();
	}
	
}
