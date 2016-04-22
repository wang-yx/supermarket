package com.wgl.supermarket.warehouse.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.warehouse.domain.Goodsnum;

import com.wgl.supermarket.warehouse.dao.GoodsnumDao;
import com.wgl.supermarket.warehouse.service.GoodsnumService;

@Service("goodsnumService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class GoodsnumServiceImpl implements GoodsnumService {
	@Autowired
	private GoodsnumDao goodsnumDao;
	@Override
	public void saveGoodsnum(Goodsnum goodsnum) {
		this.goodsnumDao.save(goodsnum);
	}
	@Override
	public List<Goodsnum> queryGoodsnumList() {
		return this.goodsnumDao.findAll();
	}
	
	//@Override
	//public PageBean queryCustomerByPage(int pageNum, int pageSize,List<Object> params) {
	//	return this.customerDao.queryCustomerByPage(pageNum, pageSize, params);
	//}

	
	
}
