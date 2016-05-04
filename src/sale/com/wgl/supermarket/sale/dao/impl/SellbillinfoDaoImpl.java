package com.wgl.supermarket.sale.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wgl.supermarket.sale.dao.SellbillinfoDao;
import com.wgl.supermarket.sale.domain.Sellbillinfo;

import com.wgl.supermarket.base.dao.impl.DaoSupportImpl;
import com.wgl.supermarket.base.util.PageBean;

@Repository("sellbillinfoDao")
public class SellbillinfoDaoImpl extends DaoSupportImpl<Sellbillinfo> implements SellbillinfoDao {

	@Override
	protected Session getSession() {
		// TODO Auto-generated method stub
		return super.getSession();
	}

	@Override
	public void save(Sellbillinfo entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void update(Sellbillinfo entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public Sellbillinfo getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<Sellbillinfo> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return super.getByIds(ids);
	}

	@Override
	public List<Sellbillinfo> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PageBean querySellbillinfoByPage(int pageNum, int pageSize,List<Object> parameters) {
		String hql = "From Sellbillinfo";
		return super.getPageBean(pageNum, pageSize, hql, parameters);
	}
}

