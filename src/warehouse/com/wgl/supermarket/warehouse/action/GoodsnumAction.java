package com.wgl.supermarket.warehouse.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;



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
	}
}
