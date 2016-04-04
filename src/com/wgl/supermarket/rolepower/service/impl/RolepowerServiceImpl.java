package com.wgl.supermarket.rolepower.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Rolepower;
import com.wgl.supermarket.rolepower.dao.RolepowerDao;
import com.wgl.supermarket.rolepower.service.RolepowerService;

@Service("rolepowerService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class RolepowerServiceImpl implements RolepowerService {
	@Autowired
	private RolepowerDao rolepowerDao;
	@Override
	public void saveRolepower(Rolepower rolepower) {
		this.rolepowerDao.save(rolepower);
	}

}
