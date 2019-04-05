package com.example.repository;

import com.example.entities.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>, JpaSpecificationExecutor<Dept> {

    public Dept findByDeptNo(Long deptNo);

    @Query(value = "INSERT INTO dept(deptName,dbSource) VALUES(?1,DATABASE())", nativeQuery = true)
    public Dept insert(String deptName);

    public List<Dept> findAll();

}
