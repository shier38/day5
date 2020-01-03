package com.bawei.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bawei.entity.Goods;
import com.bawei.service.GoodsService;
import com.bawei.vo.GoodsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService ss;
	
	@RequestMapping("list")
	public String list(Model model,GoodsVo gvo,Goods g,@RequestParam(defaultValue="1")int pageNum) {
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = ss.list(gvo);
		PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);
		model.addAttribute("list", list);
		model.addAttribute("pg", pageInfo);
		model.addAttribute("g", g);
		return "list";
	}

}
