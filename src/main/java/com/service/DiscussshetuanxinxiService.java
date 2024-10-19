package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshetuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshetuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshetuanxinxiView;


/**
 * 社团信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-08 09:49:51
 */
public interface DiscussshetuanxinxiService extends IService<DiscussshetuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshetuanxinxiVO> selectListVO(Wrapper<DiscussshetuanxinxiEntity> wrapper);
   	
   	DiscussshetuanxinxiVO selectVO(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
   	
   	List<DiscussshetuanxinxiView> selectListView(Wrapper<DiscussshetuanxinxiEntity> wrapper);
   	
   	DiscussshetuanxinxiView selectView(@Param("ew") Wrapper<DiscussshetuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshetuanxinxiEntity> wrapper);
   	
}

