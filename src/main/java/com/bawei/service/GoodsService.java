package com.bawei.service;

import java.util.List;

import com.bawei.entity.Goods;
import com.bawei.vo.GoodsVo;

public interface GoodsService {

	List<Goods> list(GoodsVo gvo);

}
