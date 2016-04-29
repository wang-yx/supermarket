package com.wgl.supermarket.purchase.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.wgl.supermarket.purchase.domain.Purchasebillinfo;

import com.wgl.supermarket.base.dao.impl.DaoSupportImpl;
import com.wgl.supermarket.base.util.PageBean;
import com.wgl.supermarket.purchase.dao.PurchasebillinfoDao;

@Repository("purchasebillinfoDao")
public class PurchasebillinfoDaoImpl extends DaoSupportImpl<Purchasebillinfo> implements PurchasebillinfoDao {

	@Override
	protected Session getSession() {
		// TODO Auto-generated method stub
		return super.getSession();
	}

	@Override
	public void save(Purchasebillinfo entity) {
		// TODO Auto-generated method stub
		super.save(entity);
	}

	@Override
	public void update(Purchasebillinfo entity) {
		// TODO Auto-generated method stub
		super.update(entity);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		super.delete(id);
	}

	@Override
	public Purchasebillinfo getById(Long id) {
		// TODO Auto-generated method stub
		return super.getById(id);
	}

	@Override
	public List<Purchasebillinfo> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return super.getByIds(ids);
	}

	@Override
	public List<Purchasebillinfo> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PageBean queryPurchasebillinfoByPage(int pageNum, int pageSize,List<Object> parameters) {
		String hql = "From Purchasebillinfo";
		return super.getPageBean(pageNum, pageSize, hql, parameters);
	}
}

