package com.zaurtregulov.spring.springboot.springboot.service;



import com.zaurtregulov.spring.springboot.springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
