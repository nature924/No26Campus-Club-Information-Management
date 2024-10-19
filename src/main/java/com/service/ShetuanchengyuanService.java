package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanchengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanchengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanchengyuanView;


/**
 * 社团成员
 *
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface ShetuanchengyuanService extends IService<ShetuanchengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanchengyuanVO> selectListVO(Wrapper<ShetuanchengyuanEntity> wrapper);
   	
   	ShetuanchengyuanVO selectVO(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
   	
   	List<ShetuanchengyuanView> selectListView(Wrapper<ShetuanchengyuanEntity> wrapper);
   	
   	ShetuanchengyuanView selectView(@Param("ew") Wrapper<ShetuanchengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanchengyuanEntity> wrapper);
   	
}

