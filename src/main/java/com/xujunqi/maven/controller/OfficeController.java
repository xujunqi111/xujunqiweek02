package com.xujunqi.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.xujunqi.maven.entity.Office;
import com.xujunqi.maven.service.OfficeService;

@Controller
public class OfficeController {

	@Autowired
	private  OfficeService  officeService;
	
	@RequestMapping("list")
	public  String  list(Model model,String  mohu, String miaoshu, Integer startmonty, Integer endmonty/*,@RequestParam(defaultValue="1") Integer  currentPage*/  ) {
		
		//PageHelper.startPage(currentPage, 3);
		
		List<Office> list  = officeService.list(mohu,miaoshu,startmonty,endmonty);
		
		model.addAttribute("mohu", mohu);
		model.addAttribute("miaoshu", miaoshu);
		model.addAttribute("startmonty", startmonty);
		model.addAttribute("endmonty", endmonty);
		model.addAttribute("list", list);
	
		return  "list";
	
	}

	
}
