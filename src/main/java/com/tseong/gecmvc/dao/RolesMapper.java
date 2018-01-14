package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.Roles;

public interface RolesMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(Roles record);

    int insertSelective(Roles record);

    Roles selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);
}