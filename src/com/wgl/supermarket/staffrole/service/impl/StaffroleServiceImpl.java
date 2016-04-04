package com.wgl.supermarket.staffrole.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Staffrole;
import com.wgl.supermarket.staffrole.dao.StaffroleDao;
import com.wgl.supermarket.staffrole.service.StaffroleService;

@Service("staffroleService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class StaffroleServiceImpl implements StaffroleService {
	@Autowired
	private StaffroleDao staffroleDao;
	@Override
	public void saveStaffrole(Staffrole staffrole) {
		this.staffroleDao.save(staffrole);
	}

}
