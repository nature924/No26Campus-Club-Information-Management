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


import com.dao.ShetuanchengyuanDao;
import com.entity.ShetuanchengyuanEntity;
import com.service.ShetuanchengyuanService;
import com.entity.vo.ShetuanchengyuanVO;
import com.entity.view.ShetuanchengyuanView;

@Service("shetuanchengyuanService")
public class ShetuanchengyuanServiceImpl extends ServiceImpl<ShetuanchengyuanDao, ShetuanchengyuanEntity> implements ShetuanchengyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanchengyuanEntity> page = this.selectPage(
                new Query<ShetuanchengyuanEntity>(params).getPage(),
                new EntityWrapper<ShetuanchengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanchengyuanEntity> wrapper) {
		  Page<ShetuanchengyuanView> page =new Query<ShetuanchengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanchengyuanVO> selectListVO(Wrapper<ShetuanchengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanchengyuanVO selectVO(Wrapper<ShetuanchengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanchengyuanView> selectListView(Wrapper<ShetuanchengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanchengyuanView selectView(Wrapper<ShetuanchengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
