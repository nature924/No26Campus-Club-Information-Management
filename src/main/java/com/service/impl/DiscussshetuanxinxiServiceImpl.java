package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshetuanxinxiDao;
import com.entity.DiscussshetuanxinxiEntity;
import com.service.DiscussshetuanxinxiService;
import com.entity.vo.DiscussshetuanxinxiVO;
import com.entity.view.DiscussshetuanxinxiView;

@Service("discussshetuanxinxiService")
public class DiscussshetuanxinxiServiceImpl extends ServiceImpl<DiscussshetuanxinxiDao, DiscussshetuanxinxiEntity> implements DiscussshetuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshetuanxinxiEntity> page = this.selectPage(
                new Query<DiscussshetuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshetuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshetuanxinxiEntity> wrapper) {
		  Page<DiscussshetuanxinxiView> page =new Query<DiscussshetuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshetuanxinxiVO> selectListVO(Wrapper<DiscussshetuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshetuanxinxiVO selectVO(Wrapper<DiscussshetuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshetuanxinxiView> selectListView(Wrapper<DiscussshetuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshetuanxinxiView selectView(Wrapper<DiscussshetuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
