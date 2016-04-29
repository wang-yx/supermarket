package com.wgl.supermarket.purchase.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wgl.supermarket.purchase.domain.Purchasebillinfo;
import com.wgl.supermarket.purchase.service.PurchasebillinfoService;

public class PurchasebillinfoAction {
	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<Purchasebillinfo> purchasebillinfoList = ((PurchasebillinfoService)ac.getBean("purchasebillinfoService")).queryPurchasebillinfoList();
		
		for(Purchasebillinfo gg:purchasebillinfoList){
			System.out.println("------>"+ gg.toString());	
			System.out.println("------>"+ gg.getPaytype());	
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		
		
	}
}
