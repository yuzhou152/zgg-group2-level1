package com.zgg.group2.rest.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zgg.group2.rest.api.RestService;
import com.zgg.group2.rest.bean.ZgUser;
import com.zgg.group2.rest.bean.ZgUserExample;
import com.zgg.group2.rest.dao.ZgUserMapper;

@Service("restService")
public class RestServiceImpl implements RestService{

	@Resource
	private ZgUserMapper zgUserMapper;
	
	@Override
	public List<ZgUser> getZgUserList(ZgUser z) {
		return zgUserMapper.selectByExample(new ZgUserExample());
	}
}
