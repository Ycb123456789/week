package com.yangchaobao.service;

import java.util.List;
import java.util.Map;

import com.yangchaobao.bean.Camp;
import com.yangchaobao.bean.Hero;

public interface HeroService {
	//查询分页
	public List<Hero> queryAll(Map<String,Object> map);
	//查询所有阵营
	public List<Camp> queryCamp();
	//添加英雄
	public int add(Hero hero);
	//购买
	public int updateHero(Hero hero);
	//查询单个
	public Hero queryOne(int hid);
}
