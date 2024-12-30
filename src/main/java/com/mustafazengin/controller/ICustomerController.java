package com.mustafazengin.controller;

import com.mustafazengin.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer findCustomerById(Long id);
}
