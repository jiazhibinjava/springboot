package com.example.springboot.service;

import com.example.springboot.pojo.LearnResouce;

import java.util.List;
import java.util.Map;

public interface LearnService {

    int add(LearnResouce learnResouce);
    int update (LearnResouce learnResouce);
    int deleteByIds(String[] ids);
    LearnResouce queryLearnResouceById(Long id);
    List<LearnResouce> queryLearnResouceList(Map<String, Object> params);
}
