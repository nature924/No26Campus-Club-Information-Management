package com.entity.view;

import com.entity.JiarushetuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 加入社团
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
@TableName("jiarushetuan")
public class JiarushetuanView  extends JiarushetuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiarushetuanView(){
	}
 
 	public JiarushetuanView(JiarushetuanEntity jiarushetuanEntity){
 	try {
			BeanUtils.copyProperties(this, jiarushetuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
