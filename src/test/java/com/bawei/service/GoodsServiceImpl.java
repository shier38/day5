package com.bawei.service;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bawei.entity.Goods;

//启动spring容器
@ContextConfiguration(locations="classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsServiceImpl {
	
	@Test
	public void testInsert() {
		ArrayList<Goods> list = new ArrayList<Goods>();
		
		for (int i = 1; i < list.size(); i++) {
			Goods goods = new Goods();
			
		}
	}
}
