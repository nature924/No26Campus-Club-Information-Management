package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiarushetuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiarushetuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiarushetuanView;


/**
 * 加入社团
 *
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface JiarushetuanService extends IService<JiarushetuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiarushetuanVO> selectListVO(Wrapper<JiarushetuanEntity> wrapper);
   	
   	JiarushetuanVO selectVO(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
   	
   	List<JiarushetuanView> selectListView(Wrapper<JiarushetuanEntity> wrapper);
   	
   	JiarushetuanView selectView(@Param("ew") Wrapper<JiarushetuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiarushetuanEntity> wrapper);
   	
}

