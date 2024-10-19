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


import com.dao.JiarushetuanDao;
import com.entity.JiarushetuanEntity;
import com.service.JiarushetuanService;
import com.entity.vo.JiarushetuanVO;
import com.entity.view.JiarushetuanView;

@Service("jiarushetuanService")
public class JiarushetuanServiceImpl extends ServiceImpl<JiarushetuanDao, JiarushetuanEntity> implements JiarushetuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiarushetuanEntity> page = this.selectPage(
                new Query<JiarushetuanEntity>(params).getPage(),
                new EntityWrapper<JiarushetuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiarushetuanEntity> wrapper) {
		  Page<JiarushetuanView> page =new Query<JiarushetuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiarushetuanVO> selectListVO(Wrapper<JiarushetuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiarushetuanVO selectVO(Wrapper<JiarushetuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiarushetuanView> selectListView(Wrapper<JiarushetuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiarushetuanView selectView(Wrapper<JiarushetuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
