package com.bobo.goods.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bobo.goods.domain.Goods;

public interface GoodsMapper {
	//列表
	List<Goods> selects(@Param("gname")String gname, Integer page, Integer pageSize);
	//添加
	int add(Goods goods);
}
