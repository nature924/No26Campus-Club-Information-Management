package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanhuodongView;


/**
 * 社团活动
 *
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface ShetuanhuodongService extends IService<ShetuanhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanhuodongVO> selectListVO(Wrapper<ShetuanhuodongEntity> wrapper);
   	
   	ShetuanhuodongVO selectVO(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
   	
   	List<ShetuanhuodongView> selectListView(Wrapper<ShetuanhuodongEntity> wrapper);
   	
   	ShetuanhuodongView selectView(@Param("ew") Wrapper<ShetuanhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanhuodongEntity> wrapper);
   	
}

