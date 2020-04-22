package com.yangchaobao.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangchaobao.bean.Camp;
import com.yangchaobao.bean.Hero;
import com.yangchaobao.service.HeroService;

@Controller
public class HeroController {
	@Resource
	private HeroService hs;

	@RequestMapping("queryAll")//查询所有分页
	public String queryAll(Model m, @RequestParam(defaultValue = "1") Integer pageNum, Integer cid, Integer status,
			Integer min, Integer max) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cid",cid);
		map.put("status",status);
		map.put("min",min);
		map.put("max",max);
		PageHelper.startPage(pageNum, 3);
		List<Hero> list = hs.queryAll(map);
		PageInfo<Hero> plist = new PageInfo<>(list);
		m.addAttribute("plist", plist);

		List<Camp> clist = hs.queryCamp();
		m.addAttribute("clist", clist);
		m.addAttribute("map",map);
		return "show";
	}
	@RequestMapping("update")//修改
	@ResponseBody
	public boolean update(Hero hero){
		System.out.println(hero);
		try {
			hs.updateHero(hero);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	@RequestMapping("queryOne")//查询单个
	public String queryOne(Model m,Integer hid){
		Hero hero = hs.queryOne(hid);
		m.addAttribute("hero", hero);
		return "showOne";
	}
	@RequestMapping("queryCamp")//查询阵营 
	@ResponseBody
	public List<Camp> queryCamp(){
		return hs.queryCamp();
	}
	@RequestMapping("add")//添加
	public String add(Hero hero){
		Date da = new Date();
		hero.setUptime(da);
		int i = hs.add(hero);
		if(i>0){
			return "redirect:queryAll";
		}else{
			return "add";
		}
	}
	@RequestMapping("queryOneH")//回显
	@ResponseBody
	public Hero queryOne(Integer hid){
		Hero hero = hs.queryOne(hid);
		return hero;
		
	}
}
