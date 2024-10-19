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


import com.dao.ShetuanfenleiDao;
import com.entity.ShetuanfenleiEntity;
import com.service.ShetuanfenleiService;
import com.entity.vo.ShetuanfenleiVO;
import com.entity.view.ShetuanfenleiView;

@Service("shetuanfenleiService")
public class ShetuanfenleiServiceImpl extends ServiceImpl<ShetuanfenleiDao, ShetuanfenleiEntity> implements ShetuanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShetuanfenleiEntity> page = this.selectPage(
                new Query<ShetuanfenleiEntity>(params).getPage(),
                new EntityWrapper<ShetuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShetuanfenleiEntity> wrapper) {
		  Page<ShetuanfenleiView> page =new Query<ShetuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShetuanfenleiVO> selectListVO(Wrapper<ShetuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShetuanfenleiVO selectVO(Wrapper<ShetuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShetuanfenleiView> selectListView(Wrapper<ShetuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShetuanfenleiView selectView(Wrapper<ShetuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
