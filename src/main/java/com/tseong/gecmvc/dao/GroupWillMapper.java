package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.GroupWill;

public interface GroupWillMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(GroupWill record);

    int insertSelective(GroupWill record);

    GroupWill selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(GroupWill record);

    int updateByPrimaryKey(GroupWill record);
}