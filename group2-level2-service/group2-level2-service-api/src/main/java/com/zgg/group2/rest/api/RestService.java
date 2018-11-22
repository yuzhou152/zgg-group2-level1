package com.zgg.group2.rest.api;

import java.util.List;

import com.zgg.group2.rest.bean.ZgUser;

public interface RestService {

	List<ZgUser> getZgUserList(ZgUser z);
}
