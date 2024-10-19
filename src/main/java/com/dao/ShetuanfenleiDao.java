package com.dao;

import com.entity.ShetuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShetuanfenleiVO;
import com.entity.view.ShetuanfenleiView;


/**
 * 社团分类
 * 
 * @author 
 * @email 
 * @date 2021-05-08 09:49:50
 */
public interface ShetuanfenleiDao extends BaseMapper<ShetuanfenleiEntity> {
	
	List<ShetuanfenleiVO> selectListVO(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
	
	ShetuanfenleiVO selectVO(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
	
	List<ShetuanfenleiView> selectListView(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);

	List<ShetuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
	
	ShetuanfenleiView selectView(@Param("ew") Wrapper<ShetuanfenleiEntity> wrapper);
	
}
