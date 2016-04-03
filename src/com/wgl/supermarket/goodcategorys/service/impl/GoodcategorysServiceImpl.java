package com.wgl.supermarket.goodcategorys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Goodcategorys;
import com.wgl.supermarket.goodcategorys.dao.GoodcategorysDao;
import com.wgl.supermarket.goodcategorys.service.GoodcategorysService;

@Service("goodcategorysService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class GoodcategorysServiceImpl implements GoodcategorysService {
	@Autowired
	private GoodcategorysDao goodcategorysDao;
	@Override
	public void saveGoodcategorys(Goodcategorys goodcategorys) {
		this.goodcategorysDao.save(goodcategorys);
	}

}
