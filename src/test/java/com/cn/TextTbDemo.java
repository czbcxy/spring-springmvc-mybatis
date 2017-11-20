package com.cn;

import com.cn.czb.bean.TextTb;
import com.cn.czb.junit.SpringJunitTest;
import com.cn.czb.service.TextService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 基于spring的junit测试4
 * 
 * @author 程征波 
 * @version 1.0
 */
public class TextTbDemo extends SpringJunitTest {
	@Autowired 
	private TextService textService;
	
	@Test
	public void testSelect(){
		TextTb tb = new TextTb();
		tb.setId(1);
		tb.setUsername("测试");
		tb.setPassword("ceshi");
		
		List<TextTb> list = textService.serlectTextTb(tb);
		for (TextTb textTb2 : list) {
			System.err.println(textTb2.getUsername());
		}
		
	}
}
