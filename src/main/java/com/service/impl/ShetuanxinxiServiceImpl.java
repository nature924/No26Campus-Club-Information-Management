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


import com.dao.ShetuanxinxiDao;
import com.entity.ShetuanxinxiEntity;
import com.service.ShetuanxinxiService;
import com.entity.vo.ShetuanxinxiVO;
import com.entity.view.ShetuanxinxiView;

@Service("shetuanxinxiService")
public class ShetuanxinxiServiceImpl extends ServiceImpl<ShetuanxinxiDao, ShetuanxinxiEntity> implements ShetuanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanxinxiEntity> page = this.selectPage(
                new Query<ShetuanxinxiEntity>(params).getPage(),
                new EntityWrapper<ShetuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanxinxiEntity> wrapper) {
		  Page<ShetuanxinxiView> page =new Query<ShetuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanxinxiVO> selectListVO(Wrapper<ShetuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanxinxiVO selectVO(Wrapper<ShetuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanxinxiView> selectListView(Wrapper<ShetuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanxinxiView selectView(Wrapper<ShetuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
