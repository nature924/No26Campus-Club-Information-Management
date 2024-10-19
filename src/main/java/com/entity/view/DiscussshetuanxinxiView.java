package com.entity.view;

import com.entity.DiscussshetuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 社团信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
@TableName("discussshetuanxinxi")
public class DiscussshetuanxinxiView  extends DiscussshetuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshetuanxinxiView(){
	}
 
 	public DiscussshetuanxinxiView(DiscussshetuanxinxiEntity discussshetuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshetuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
