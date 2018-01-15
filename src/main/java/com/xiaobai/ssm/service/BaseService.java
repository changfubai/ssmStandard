package com.xiaobai.ssm.service;

import java.util.List;

public interface BaseService<T>{
    T selectByPrimaryKey(Integer id);
    List<T> selectAll();
    String selectByPrimaryKey();

    List<T> selectPage(int pageNum, int pageSize);
}
