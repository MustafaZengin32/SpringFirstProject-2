package com.mustafazengin.services;

import com.mustafazengin.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeService {

    public List<DtoEmployee> findEmployees();

}
