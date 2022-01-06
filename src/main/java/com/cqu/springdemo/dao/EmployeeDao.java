package com.cqu.springdemo.dao;

import com.cqu.springdemo.pojo.Department;
import com.cqu.springdemo.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employeeMap=null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employeeMap=new HashMap<Integer,Employee>();
        employeeMap.put(1001,new Employee(01,"changyao","changyao@163.com",0,new Department("后勤部",1001),20211125));


    }

private static Integer initid=02;
    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initid++);
        }
        employee.setDepartment(departmentDao.getDepartmentid(employee.getDepartment().getId()));
        employeeMap.put(employee.getId(),employee);
    }
    public static Collection<Employee> GETALL(){
        return employeeMap.values();
    }
    public Employee getemployeeid(Integer id){
        return employeeMap.get(id);
    }
    public void deleteemployee(Integer id){
        employeeMap.remove(id);

    }

    public static void main(String[] args) {
        Collection<Employee> employees=EmployeeDao.GETALL();
        System.out.println(employees);
    }

}
