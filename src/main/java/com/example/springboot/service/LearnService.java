package com.example.springboot.service;

import com.example.springboot.pojo.LearnResouce;
import com.example.springboot.toools.Page;

import java.util.Map;

public interface LearnService {

    int add(LearnResouce learnResouce);
    int update (LearnResouce learnResouce);
    int deleteByIds(String id);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList (Map<String,Object> params);
}
