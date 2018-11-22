package com.zgg.group2.rest.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zgg.group2.common.action.BaseAction;
import com.zgg.group2.common.code.CodeEC;
import com.zgg.group2.common.json.JsonResult;
import com.zgg.group2.rest.bean.ZgUser;
import com.zgg.group2.rest.service.RestServicePretend;

@RestController
@RequestMapping("/restController")
public class RestControllerDemo extends BaseAction {
	private static final Logger logger = LoggerFactory.getLogger(RestControllerDemo.class);

	@Autowired
	private RestServicePretend restServicePretend;

	@RequestMapping(value = "demoInterface/{pathVariable}", method = RequestMethod.GET)
	public JsonResult<List<ZgUser>> getZgUserList(@PathVariable String pathVariable) {
		try {
			List<ZgUser> sr = restServicePretend.getZgUserList();
				return buildSuccessJsonResult(sr, CodeEC.SUCCESS);
		} catch (Exception e) {
			logger.error("error msg.", e);
			return buildFailJsonResult(CodeEC.NONE);
		}
	}
}
