package com.business.employee.service.interfaces;

import com.business.employee.model.Employee;
import com.business.employee.service.dto.EmployeeRequest;

import java.util.List;

public interface IEmployeeService {

    Employee getEmployeeById(Long id);

    List<Employee> getEmployees();

    Employee createEmployee(EmployeeRequest request);

    void deleteEmployee(Long id);
}
