package com.yangchaobao.test;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.yangchaobao.bean.Hero;

import com.yangchaobao.service.HeroService;
import com.yangchaobao.service.HeroServiceImp;

public class Mytest {
	@Test
	public void test01(){//添加
		ApplicationContext cls = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroService b = (HeroService) cls.getBean("heroServiceImp",HeroServiceImp.class);
		Hero h=new Hero();
		h.setCname("孙悟空");
		h.setPrice(18888);
		h.setHid(1);
		int i = b.add(h);
		if(i>0){
			System.out.println("添加成功");
		}
	}
	@Test
	public void test02(){//查询单个
		ApplicationContext cls = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroServiceImp b = cls.getBean("heroServiceImp",HeroServiceImp.class);
		Hero hero = b.queryOne(1);
		System.out.println(hero);
	}
	@Test
	public void test03(){//修改
		ApplicationContext cls = new ClassPathXmlApplicationContext("applicationContext.xml");
		HeroService b =  cls.getBean("heroServiceImp",HeroServiceImp.class);
		Hero h=new Hero();
		h.setCid(1);
		h.setCname("孙悟空");
		h.setPrice(18888);
		h.setHid(1);
		int i = b.updateHero(h);
		if(i>0){
			System.out.println("修改成功");
		}
	}
}
