package com.cn.czb.dao;

import com.cn.czb.bean.TextTb;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 测试接口
 * 
 * @author 程征波 
 * @version 1.0
 */
@Repository
public interface TextTbDao {
	 List<TextTb> serlectTextTb(TextTb  tb);
}
