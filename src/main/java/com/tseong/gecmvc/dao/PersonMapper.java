package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.Person;

public interface PersonMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}