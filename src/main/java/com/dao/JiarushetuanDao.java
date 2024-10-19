package com.dao;

import com.entity.JiarushetuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiarushetuanVO;
import com.entity.view.JiarushetuanView;


/**
 * 加入社团
 * 
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface JiarushetuanDao extends BaseMapper<JiarushetuanEntity> {
	
	List<JiarushetuanVO> selectListVO(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
	
	JiarushetuanVO selectVO(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
	
	List<JiarushetuanView> selectListView(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);

	List<JiarushetuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
	
	JiarushetuanView selectView(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
	
}
