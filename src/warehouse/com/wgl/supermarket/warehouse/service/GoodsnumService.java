package com.wgl.supermarket.warehouse.service;

import java.util.List;

import com.wgl.supermarket.base.util.PageBean;
import com.wgl.supermarket.warehouse.domain.Goodsnum;


public interface GoodsnumService {
	/**
	 * 保存goodsnum
	 * @param goodsnum
	 */
	public void saveGoodsnum(Goodsnum goodsnum);
	/**
	 * 查询全部
	 * @return
	 */
	public List<Goodsnum> queryGoodsnumList();
	/**
	 * 分页查询
	 * @param pageNum	当前页
	 * @param pageSize	页大小：使用PageBean.DEFAULT_PAGE_SIZE 方便配置
	 * @param params	分页时的查询条件参数
	 * @return
	 */
	public PageBean queryGoodsnumByPage(int pageNum,int pageSize,List<Object> params);
}
