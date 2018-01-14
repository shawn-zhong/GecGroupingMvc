package com.tseong.gecmvc.service;

import com.tseong.gecmvc.dao.PersonMapper;
import com.tseong.gecmvc.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    public Person getPersonById(int id) {
        return personMapper.selectByPrimaryKey(id);
    }

}
