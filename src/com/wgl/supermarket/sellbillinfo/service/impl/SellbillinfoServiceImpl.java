package com.wgl.supermarket.sellbillinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Sellbillinfo;
import com.wgl.supermarket.sellbillinfo.dao.SellbillinfoDao;
import com.wgl.supermarket.sellbillinfo.service.SellbillinfoService;

@Service("sellbillinfoService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class SellbillinfoServiceImpl implements SellbillinfoService {
	@Autowired
	private SellbillinfoDao sellbillinfoDao;
	@Override
	public void saveSellbillinfo(Sellbillinfo sellbillinfo) {
		this.sellbillinfoDao.save(sellbillinfo);
	}

}
