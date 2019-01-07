package com.example.springboot.dao;

import com.example.springboot.pojo.LearnResouce;
import com.example.springboot.toools.Page;

import java.util.Map;

public interface LearnDao {
    int add(LearnResouce learnResouce);
    int updata(LearnResouce learnResouce);
    int deleteByIds(String ids);
    LearnResouce queryLearnResouceById(Long id);
    Page queryLearnResouceList(Map<String,Object> params);
}
