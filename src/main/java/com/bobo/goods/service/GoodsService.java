package com.bobo.goods.service;

import com.bobo.goods.domain.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> selects(String gname, Integer pageNum, Integer pageSize);

}
