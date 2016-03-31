package com.wgl.supermarket.base.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wgl.supermarket.base.dao.BaseDao;

@Repository
public class BaseDaoImpl implements BaseDao {
	@Autowired
	private SessionFactory sessionFactory;
	private Session getSession(){
		return this.sessionFactory.getCurrentSession();
	}
	@Override
	public void save(Object obj) {
		this.getSession().save(obj);
	}
	
}
