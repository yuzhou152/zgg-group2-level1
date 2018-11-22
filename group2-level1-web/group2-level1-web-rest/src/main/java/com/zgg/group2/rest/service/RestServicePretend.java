package com.zgg.group2.rest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zgg.group2.rest.api.RestService;
import com.zgg.group2.rest.bean.ZgUser;

@Service("restServicePretend")
public class RestServicePretend {
    private static final Logger logger = LoggerFactory.getLogger(RestServicePretend.class);
	@Autowired
	private RestService restService;

	public List<ZgUser> getZgUserList() {
		return restService.getZgUserList(new ZgUser());
	}
}
