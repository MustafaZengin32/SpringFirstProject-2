package com.mustafazengin.services;

import com.mustafazengin.dto.DtoCustomer;

public interface ICustomerService {

    public DtoCustomer findCustomerById(Long id);


}
