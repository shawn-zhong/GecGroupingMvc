package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.Activity;

public interface ActivityMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}