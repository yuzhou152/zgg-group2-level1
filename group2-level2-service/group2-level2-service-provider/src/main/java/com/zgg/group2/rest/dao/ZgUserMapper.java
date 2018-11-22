package com.zgg.group2.rest.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.zgg.group2.rest.bean.ZgUser;
import com.zgg.group2.rest.bean.ZgUserExample;


public interface ZgUserMapper {
    int countByExample(ZgUserExample example);

    int deleteByExample(ZgUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZgUser record);

    int insertSelective(ZgUser record);

    List<ZgUser> selectByExample(ZgUserExample example);
    
    ZgUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZgUser record, @Param("example") ZgUserExample example);

    int updateByExample(@Param("record") ZgUser record, @Param("example") ZgUserExample example);

    int updateByPrimaryKeySelective(ZgUser record);

    int updateByPrimaryKey(ZgUser record);

	List<ZgUser> selectByExampleWithRowbounds(ZgUserExample example, RowBounds rowBounds);
}