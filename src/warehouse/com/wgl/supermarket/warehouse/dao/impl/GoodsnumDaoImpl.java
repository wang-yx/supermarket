package com.wgl.supermarket.warehouse.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wgl.supermarket.base.dao.impl.DaoSupportImpl;
import com.wgl.supermarket.base.util.PageBean;
import com.wgl.supermarket.warehouse.dao.GoodsnumDao;
import com.wgl.supermarket.warehouse.domain.Goodsnum;

@Repository("goodsnumDao")
public class GoodsnumDaoImpl extends DaoSupportImpl<Goodsnum> implements GoodsnumDao {

	@Override
	protected Session getSession() {
		// TODO Auto-generated method stub
		return super.getSession();
	}

	@Override
	public void save(Goodsnum entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void update(Goodsnum entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public Goodsnum getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<Goodsnum> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return super.getByIds(ids);
	}

	@Override
	public List<Goodsnum> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public PageBean queryGoodsnumByPage(int pageNum, int pageSize,List<Object> parameters) {
		String hql = "From Goodsnum";
		return super.getPageBean(pageNum, pageSize, hql, parameters);
	}
}

