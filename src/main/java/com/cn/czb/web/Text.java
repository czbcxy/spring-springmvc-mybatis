package com.cn.czb.web;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.czb.bean.TextTb;
import com.cn.czb.service.TextService;

/**
 * springmvc测试类
 * 
 * @author 程征波
 * @version 1.0
 */
@Controller
public class Text {
	@Autowired
	private TextService textService;
	
	@RequestMapping(value="/web/index.do")
	public String index(Model model,TextTb tb){
		
		List<TextTb> list = textService.serlectTextTb(tb);
		
		if (list.size() == 0 || list == null) {
			return "/fack";
		}
		//回显到页面
		model.addAttribute("textTb", list);		
		return "/index";
	}
}
