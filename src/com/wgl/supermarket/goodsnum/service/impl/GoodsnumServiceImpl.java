package com.wgl.supermarket.goodsnum.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Goodsnum;
import com.wgl.supermarket.goodsnum.dao.GoodsnumDao;
import com.wgl.supermarket.goodsnum.service.GoodsnumService;


@Service("goodsnumService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class GoodsnumServiceImpl implements GoodsnumService {
	@Autowired
	private GoodsnumDao goodsnumDao;
	@Override
	public void saveGoodsnum(Goodsnum goodsnum) {
		this.goodsnumDao.save(goodsnum);
	}

}
