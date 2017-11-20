package com.cn.czb.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.czb.bean.TextTb;
import com.cn.czb.dao.TextTbDao;
import com.cn.czb.service.TextService;

/**
 * 测试服务类
 * 
 * @author 程征波
 * @version 1.0 
 */
@Service
@Transactional
public class TextServiceImpl implements TextService{
	/**
	 *
	 */
	@Autowired
	private TextTbDao textTbDao;
	
	@Override
	public List<TextTb > serlectTextTb(TextTb tb) {
		return textTbDao.serlectTextTb(tb);
	}

}
