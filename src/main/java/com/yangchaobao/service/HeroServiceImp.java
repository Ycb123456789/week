package com.yangchaobao.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yangchaobao.bean.Camp;
import com.yangchaobao.bean.Hero;
import com.yangchaobao.mapper.HeroMapper;
@Service
public class HeroServiceImp implements HeroService {
	@Resource
private HeroMapper hm;
	@Override
	public List<Hero> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return hm.queryAll(map);
	}

	@Override
	public List<Camp> queryCamp() {
		// TODO Auto-generated method stub
		return hm.queryCamp();
	}

	@Override
	public int add(Hero hero) {
		// TODO Auto-generated method stub
		return hm.add(hero);
	}

	@Override
	public int updateHero(Hero hero) {
		// TODO Auto-generated method stub
		return hm.updateHero(hero);
	}

	@Override
	public Hero queryOne(int hid) {
		// TODO Auto-generated method stub
		return hm.queryOne(hid);
	}

}
