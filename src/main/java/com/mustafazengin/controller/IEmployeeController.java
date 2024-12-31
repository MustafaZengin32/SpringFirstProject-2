package com.mustafazengin.controller;

import com.mustafazengin.dto.DtoEmployee;

import java.util.List;

public interface IEmployeeController {

    public List<DtoEmployee> findEmployees();
}
