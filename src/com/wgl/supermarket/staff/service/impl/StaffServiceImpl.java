package com.wgl.supermarket.staff.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wgl.supermarket.domain.Staff;
import com.wgl.supermarket.staff.dao.StaffDao;
import com.wgl.supermarket.staff.service.StaffService;

@Service("staffService")
@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffDao staffDao;
	@Override
	public void saveStaff(Staff staff) {
		this.staffDao.save(staff);
	}

}
