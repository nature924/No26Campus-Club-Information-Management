package com.dao;

import com.entity.DiscussshetuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshetuanxinxiVO;
import com.entity.view.DiscussshetuanxinxiView;


/**
 * 社团信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface DiscussshetuanxinxiDao extends BaseMapper<DiscussshetuanxinxiEntity> {
	
	List<DiscussshetuanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
	
	DiscussshetuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
	
	List<DiscussshetuanxinxiView> selectListView(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);

	List<DiscussshetuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
	
	DiscussshetuanxinxiView selectView(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
	
}
