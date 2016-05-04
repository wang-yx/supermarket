package com.wgl.supermarket.sale.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wgl.supermarket.sale.domain.Sellbillinfo;

import com.wgl.supermarket.sale.service.SellbillinfoService;

public class SellbillinfoAction {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<Sellbillinfo> sellbillinfo = ((SellbillinfoService)ac.getBean("sellbillinfoService")).querySellbillinfoList();
		
		for(Sellbillinfo gg:sellbillinfo){
			System.out.println("------>"+ gg.toString());	
			System.out.println("------>"+ gg.getPaytype());	
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		
	}
}
