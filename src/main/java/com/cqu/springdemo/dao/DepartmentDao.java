package com.cqu.springdemo.dao;

import com.cqu.springdemo.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    private static Map<Integer, Department> departmentMap=null;

    static {
        departmentMap=new HashMap<Integer,Department>();
        departmentMap.put(1001,new Department("教学部",1001));
        departmentMap.put(1002,new Department("体育部",1002));
        departmentMap.put(1003,new Department("运营部",1003));
        departmentMap.put(1004,new Department("保障部",1004));
        departmentMap.put(1005,new Department("武装部",1005));

    }
    public static Collection<Department> getDepartment(){
        return departmentMap.values();
    }
    public Department getDepartmentid(Integer ID){
        return departmentMap.get(ID);
    }
}
