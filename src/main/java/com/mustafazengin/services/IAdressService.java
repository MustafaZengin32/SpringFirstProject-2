package com.mustafazengin.services;

import com.mustafazengin.dto.DtoAdress;
import com.mustafazengin.dto.DtoCustomer;

public interface IAdressService {

    public DtoAdress findAdressById(Long id);
}
