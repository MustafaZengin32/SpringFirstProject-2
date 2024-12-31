package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoDepartment;
import com.mustafazengin.dto.DtoEmployee;
import com.mustafazengin.entities.Employee;
import com.mustafazengin.repository.EmployeeRepository;
import com.mustafazengin.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> findEmployees() {

        List<DtoEmployee> dtoEmployeeList=new ArrayList<DtoEmployee>();

        List<Employee> employeeList = employeeRepository.findAll();

        if (employeeList!=null && !employeeList.isEmpty()) {
            for (Employee employee:employeeList){

                DtoEmployee dtoEmployee=new DtoEmployee();

                BeanUtils.copyProperties(employee,dtoEmployee);

                dtoEmployee.setDepartment(new DtoDepartment(employee.getDepartment().getId(), employee.getDepartment().getDepartmentName()));

                dtoEmployeeList.add(dtoEmployee);

            }

        }
        return dtoEmployeeList;
    }
}
