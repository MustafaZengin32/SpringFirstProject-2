package com.mustafazengin.controller;

import com.mustafazengin.dto.DtoAdress;
import com.mustafazengin.dto.DtoCustomer;

public interface IAdressController {
    public DtoAdress findAdressById(Long id);
}
