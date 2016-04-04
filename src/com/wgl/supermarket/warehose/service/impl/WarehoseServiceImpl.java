package com.wgl.supermarket.warehose.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Warehose;
import com.wgl.supermarket.warehose.dao.WarehoseDao;
import com.wgl.supermarket.warehose.service.WarehoseService;

@Service("warehoseService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class WarehoseServiceImpl implements WarehoseService {
	@Autowired
	private WarehoseDao warehoseDao;
	@Override
	public void saveWarehose(Warehose warehose) {
		this.warehoseDao.save(warehose);
	}

}
