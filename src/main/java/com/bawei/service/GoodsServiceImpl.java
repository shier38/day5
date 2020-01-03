package com.bawei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.entity.Goods;
import com.bawei.mapper.GoodsMapper;
import com.bawei.vo.GoodsVo;

@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Resource
	private GoodsMapper mapper;

	@Override
	public List<Goods> list(GoodsVo gvo) {
		// TODO 
		return mapper.list(gvo);
	}
	
	

}
