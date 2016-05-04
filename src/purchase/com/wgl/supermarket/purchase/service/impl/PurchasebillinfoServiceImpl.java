package com.wgl.supermarket.purchase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.purchase.dao.PurchasebillinfoDao;

import com.wgl.supermarket.base.util.PageBean;
import com.wgl.supermarket.purchase.domain.Purchasebillinfo;
import com.wgl.supermarket.purchase.service.PurchasebillinfoService;

@Service("purchasebillinfoService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PurchasebillinfoServiceImpl implements PurchasebillinfoService {
	@Autowired
	private PurchasebillinfoDao purchasebillinfoDao;
	@Override
	public void savePurchasebillinfo(Purchasebillinfo purchasebillinfo) {
		this.purchasebillinfoDao.save(purchasebillinfo);
	}
	@Override
	public List<Purchasebillinfo> queryPurchasebillinfoList() {
		return this.purchasebillinfoDao.findAll();
	}
	@Override
	public PageBean queryPurchasebillinfoByPage(int pageNum, int pageSize,List<Object> params) {
		return this.purchasebillinfoDao.queryPurchasebillinfoByPage(pageNum, pageSize, params);
	}

	
}
