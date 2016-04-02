package com.wgl.supermarket.goods.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Goods;
import com.wgl.supermarket.goods.dao.GoodsDao;
import com.wgl.supermarket.goods.service.GoodsService;

@Service("goodsService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	@Override
	public void saveGoods(Goods goods) {
		this.goodsDao.save(goods);
	}

}
