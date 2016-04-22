package com.wgl.supermarket.warehouse.dao;

import java.util.List;

import com.wgl.supermarket.warehouse.domain.Goodsnum;

import com.wgl.supermarket.base.dao.DaoSupport;

public interface GoodsnumDao extends DaoSupport<Goodsnum> {
	/**
	 * 保存实体
	 * 
	 * @param goodsnum
	 */
	public void save(Goodsnum goodsnum);

	/**
	 * 删除实体
	 * 
	 * @param id
	 */
	public void delete(Long id);

	/**
	 * 更新实体
	 * 
	 * @param entity
	 */
	public void update(Goodsnum goodsnum);

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	public Goodsnum getById(Long id);

	/**
	 * 按id查询
	 * 
	 * @param ids
	 * @return
	 */
	public List<Goodsnum> getByIds(Long[] ids);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Goodsnum> findAll();

}
