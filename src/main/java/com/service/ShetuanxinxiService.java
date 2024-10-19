package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShetuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShetuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShetuanxinxiView;


/**
 * 社团信息
 *
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface ShetuanxinxiService extends IService<ShetuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShetuanxinxiVO> selectListVO(Wrapper<ShetuanxinxiEntity> wrapper);
   	
   	ShetuanxinxiVO selectVO(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
   	
   	List<ShetuanxinxiView> selectListView(Wrapper<ShetuanxinxiEntity> wrapper);
   	
   	ShetuanxinxiView selectView(@Param("ew") Wrapper<ShetuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShetuanxinxiEntity> wrapper);
   	
}

