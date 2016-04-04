package com.wgl.supermarket.purchasebillinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Purchasebillinfo;
import com.wgl.supermarket.purchasebillinfo.dao.PurchasebillinfoDao;
import com.wgl.supermarket.purchasebillinfo.service.PurchasebillinfoService;

@Service("purchasebillinfoService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PurchasebillinfoServiceImpl implements PurchasebillinfoService {
	@Autowired
	private PurchasebillinfoDao purchasebillinfoDao;
	@Override
	public void savePurchasebillinfo(Purchasebillinfo purchasebillinfo) {
		this.purchasebillinfoDao.save(purchasebillinfo);
	}

}
