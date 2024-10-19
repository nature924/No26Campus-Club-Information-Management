package com.dao;

import com.entity.ShetuanhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanhuodongVO;
import com.entity.view.ShetuanhuodongView;


/**
 * 社团活动
 * 
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface ShetuanhuodongDao extends BaseMapper<ShetuanhuodongEntity> {
	
	List<ShetuanhuodongVO> selectListVO(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
	
	ShetuanhuodongVO selectVO(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
	
	List<ShetuanhuodongView> selectListView(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);

	List<ShetuanhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
	
	ShetuanhuodongView selectView(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
	
}
