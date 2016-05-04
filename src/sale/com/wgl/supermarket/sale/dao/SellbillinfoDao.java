package com.wgl.supermarket.sale.dao;

import java.util.List;

import com.wgl.supermarket.purchase.domain.Purchasebillinfo;
import com.wgl.supermarket.sale.domain.Sellbillinfo;
import com.wgl.supermarket.base.dao.DaoSupport;
import com.wgl.supermarket.base.util.PageBean;

public interface SellbillinfoDao extends DaoSupport<Sellbillinfo> {
	/**
	 * 保存实体
	 * 
	 * @param goodsnum
	 */
	public void save(Sellbillinfo sellbillinfo);

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
	public void update(Sellbillinfo sellbillinfo);

	/**
	 * 按id查询
	 * 
	 * @param id
	 * @return
	 */
	public Sellbillinfo getById(Long id);

	/**
	 * 按id查询
	 * 
	 * @param ids
	 * @return
	 */
	public List<Sellbillinfo> getByIds(Long[] ids);

	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<Sellbillinfo> findAll();
	
	/**
	 * 公共的查询分页信息的方法
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param hql
	 *            查询数据列表的HQL
	 * @param parameters
	 *            参数列表，与HQL中问号一一对应
	 * @return
	 */
	public PageBean querySellbillinfoByPage(int pageNum, int pageSize,List<Object> parameters);
}
