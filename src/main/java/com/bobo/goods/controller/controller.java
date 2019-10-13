package com.bobo.goods.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bobo.goods.domain.Goods;
import com.bobo.goods.service.GoodsService;
import com.bobo.goods.util.PageUtil;
import com.github.pagehelper.PageInfo;

@Controller
public class controller {
	@Autowired
	private GoodsService service;
	
	//写到46分钟--
	@RequestMapping("list.do")
	public String selects(HttpServletRequest request,String gname,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue= "3")Integer pageSize){
		PageInfo<Goods> info = service.selects(gname,page,pageSize);
		PageUtil.page(request, "/selects?gname="+gname, pageSize, info.getList(), (int)info.getTotal(), page);
		
		request.setAttribute("goods", info.getList());
		request.setAttribute("gname", gname);
		return "list";
		
	} 
}
