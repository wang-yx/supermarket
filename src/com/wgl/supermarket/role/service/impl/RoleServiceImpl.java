package com.wgl.supermarket.role.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Role;
import com.wgl.supermarket.role.dao.RoleDao;
import com.wgl.supermarket.role.service.RoleService;

@Service("roleService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	@Override
	public void saveRole(Role role) {
		this.roleDao.save(role);
	}

}
