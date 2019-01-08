package com.example.springboot.service.impl;

import com.example.springboot.dao.LearnDao;
import com.example.springboot.pojo.LearnResouce;
import com.example.springboot.service.LearnService;
import com.example.springboot.toools.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LearnServiceImpl implements LearnService {

    @Autowired
    LearnDao learnDao;
    @Override
    public int add(LearnResouce learnResouce) {
        return this.learnDao.add(learnResouce);
    }

    @Override
    public int update(LearnResouce learnResouce) {
        return this.learnDao.updata(learnResouce);
    }

    @Override
    public int deleteByIds(String id) {
        return this.learnDao.deleteByIds(id);
    }

    @Override
    public LearnResouce queryLearnResouceById(Long id) {
        return this.learnDao.queryLearnResouceById(id);
    }

    @Override
    public Page queryLearnResouceList(Map<String, Object> params) {
        return this.learnDao.queryLearnResouceList(params);
    }
}
