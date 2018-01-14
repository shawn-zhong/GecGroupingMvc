package com.tseong.gecmvc.dao;

import com.tseong.gecmvc.model.GroupDone;

public interface GroupDoneMapper {
    int deleteByPrimaryKey(Integer gId);

    int insert(GroupDone record);

    int insertSelective(GroupDone record);

    GroupDone selectByPrimaryKey(Integer gId);

    int updateByPrimaryKeySelective(GroupDone record);

    int updateByPrimaryKey(GroupDone record);
}