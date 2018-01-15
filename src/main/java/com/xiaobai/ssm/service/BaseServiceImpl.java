package com.xiaobai.ssm.service;

import com.github.pagehelper.PageHelper;
import com.xiaobai.ssm.common.baseMapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

@Service
public abstract class BaseServiceImpl<T> implements BaseService<T>{

    @Autowired
    protected BaseMapper<T> baseMapper;

    @Override
    public T selectByPrimaryKey(Integer id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public String selectByPrimaryKey() {
        return "123123";
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    /**
     * 单表分页查询
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public List<T> selectPage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        return baseMapper.select(null);
    }
}
