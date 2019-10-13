package com.bobo.goods.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bobo.goods.dao.GoodsMapper;
import com.bobo.goods.domain.Goods;
import com.bobo.goods.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class GoodsServiceimpl implements GoodsService{
	@Autowired//或者@Resource
	private GoodsMapper mapper;

	@Override
	public PageInfo<Goods> selects(String gname, Integer page, Integer pageSize) {
		PageHelper.startPage(page, pageSize);
		List<Goods> list =  mapper.selects(gname,page,pageSize);
		return new PageInfo<Goods>(list);
	}
	
}
