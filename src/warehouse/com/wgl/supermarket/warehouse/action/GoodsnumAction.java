package com.wgl.supermarket.warehouse.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wgl.supermarket.base.util.PageBean;

import com.wgl.supermarket.warehouse.domain.Goodsnum;
import com.wgl.supermarket.warehouse.service.GoodsnumService;

public class GoodsnumAction {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//test = (Goodsnum) ac.getBean("Goodsnum");
		
		//GoodsnumServiceImpl tempGoodsnum = new GoodsnumServiceImpl();
		List<Goodsnum> goodsnumList = ((GoodsnumService)ac.getBean("goodsnumService")).queryGoodsnumList();
		
		for(Goodsnum gg:goodsnumList){
			System.out.println("------>"+ gg.toString());	
			System.out.println("------>"+ gg.getId());	
			System.out.println("------>"+ gg.getNumber());
			System.out.println("------>"+ gg.getPurchasecode());
			System.out.println("------>"+ gg.getProductdate());
			System.out.println("------>"+ gg.getFinalnum());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		PageBean pageBean = ((GoodsnumService)ac.getBean("goodsnumService")).queryGoodsnumByPage(1, PageBean.DEFAULT_PAGE_SIZE, null);
		System.out.println("总页数："+pageBean.getPageCount());
		System.out.println("每页大小："+pageBean.getPageSize());
		System.out.println("当前页："+pageBean.getCurrentPage());
		System.out.println("开始页："+pageBean.getBeginPageIndex());
		System.out.println("结束页："+pageBean.getEndPageIndex());
		System.out.println("页面内容：");
		for (Object goodsnum : pageBean.getRecordList()) {
			Goodsnum gg = (Goodsnum)goodsnum;
			System.out.println(gg.toString());
			System.out.println("------>"+ gg.getId());	
			System.out.println("------>"+ gg.getNumber());
			System.out.println("------>"+ gg.getPurchasecode());
			System.out.println("------>"+ gg.getProductdate());
			System.out.println("------>"+ gg.getFinalnum());
			
		}
		
	}
}
