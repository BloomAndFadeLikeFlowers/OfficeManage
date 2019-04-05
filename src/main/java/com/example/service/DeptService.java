package com.example.service;

import com.example.common.ParamData;
import com.example.entities.Dept;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface DeptService {

    public Dept add(Dept dept);

    public Dept get(Long id);

    public void del(Long deptno);

    public Page<Dept> findAll(ParamData paramData);
}
