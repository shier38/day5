package com.bawei.mapper;

import java.util.List;

import com.bawei.entity.Goods;
import com.bawei.vo.GoodsVo;

public interface GoodsMapper {

	List<Goods> list(GoodsVo gvo);

}
