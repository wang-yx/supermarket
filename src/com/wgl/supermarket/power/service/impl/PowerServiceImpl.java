package com.wgl.supermarket.power.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Power;
import com.wgl.supermarket.power.dao.PowerDao;
import com.wgl.supermarket.power.service.PowerService;

@Service("powerService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class PowerServiceImpl implements PowerService {
	@Autowired
	private PowerDao powerDao;
	@Override
	public void savePower(Power power) {
		this.powerDao.save(power);
	}

}
