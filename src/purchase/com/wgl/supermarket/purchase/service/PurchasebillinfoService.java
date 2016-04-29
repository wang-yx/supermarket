package com.wgl.supermarket.purchase.service;

import java.util.List;

import com.wgl.supermarket.purchase.domain.Purchasebillinfo;

import com.wgl.supermarket.base.util.PageBean;


public interface PurchasebillinfoService {
	/**
	 * 保存purchasebillinfo
	 * @param purchasebillinfo
	 */
	public void savePurchasebillinfo(Purchasebillinfo purchasebillinfo);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Purchasebillinfo> queryPurchasebillinfoList();
	/**
	 * 分页查询
	 * @param pageNum	当前页
	 * @param pageSize	页大小：使用PageBean.DEFAULT_PAGE_SIZE 方便配置
	 * @param params	分页时的查询条件参数
	 * @return
	 */
	public PageBean queryPurchasebillinfoByPage(int pageNum,int pageSize,List<Object> params);
}
