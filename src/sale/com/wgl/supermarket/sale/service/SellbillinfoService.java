package com.wgl.supermarket.sale.service;

import java.util.List;

import com.wgl.supermarket.sale.domain.Sellbillinfo;

import com.wgl.supermarket.base.util.PageBean;


public interface SellbillinfoService {
	/**
	 * 保存sellbillinfo
	 * @param sellbillinfo
	 */
	public void saveSellbillinfo(Sellbillinfo sellbillinfo);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Sellbillinfo> querySellbillinfoList();
	/**
	 * 分页查询
	 * @param pageNum	当前页
	 * @param pageSize	页大小：使用PageBean.DEFAULT_PAGE_SIZE 方便配置
	 * @param params	分页时的查询条件参数
	 * @return
	 */
	public PageBean querySellbillinfoByPage(int pageNum,int pageSize,List<Object> params);
}
