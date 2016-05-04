package com.wgl.supermarket.sale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.sale.dao.SellbillinfoDao;
import com.wgl.supermarket.sale.domain.Sellbillinfo;

import com.wgl.supermarket.base.util.PageBean;
import com.wgl.supermarket.sale.service.SellbillinfoService;

@Service("sellbillinfoService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class SellbillinfoServiceImpl implements SellbillinfoService {
	@Autowired
	private SellbillinfoDao sellbillinfoDao;
	@Override
	public void saveSellbillinfo(Sellbillinfo sellbillinfo) {
		this.sellbillinfoDao.save(sellbillinfo);
	}
	@Override
	public List<Sellbillinfo> querySellbillinfoList() {
		return this.sellbillinfoDao.findAll();
	}
	@Override
	public PageBean querySellbillinfoByPage(int pageNum, int pageSize,List<Object> params) {
		return this.sellbillinfoDao.querySellbillinfoByPage(pageNum, pageSize, params);
	}

	
}
