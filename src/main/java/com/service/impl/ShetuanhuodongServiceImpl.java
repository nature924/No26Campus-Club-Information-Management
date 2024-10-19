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


import com.dao.ShetuanhuodongDao;
import com.entity.ShetuanhuodongEntity;
import com.service.ShetuanhuodongService;
import com.entity.vo.ShetuanhuodongVO;
import com.entity.view.ShetuanhuodongView;

@Service("shetuanhuodongService")
public class ShetuanhuodongServiceImpl extends ServiceImpl<ShetuanhuodongDao, ShetuanhuodongEntity> implements ShetuanhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanhuodongEntity> page = this.selectPage(
                new Query<ShetuanhuodongEntity>(params).getPage(),
                new EntityWrapper<ShetuanhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanhuodongEntity> wrapper) {
		  Page<ShetuanhuodongView> page =new Query<ShetuanhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanhuodongVO> selectListVO(Wrapper<ShetuanhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanhuodongVO selectVO(Wrapper<ShetuanhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanhuodongView> selectListView(Wrapper<ShetuanhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanhuodongView selectView(Wrapper<ShetuanhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
