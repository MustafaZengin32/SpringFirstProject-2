package com.mustafazengin.controller.impl;

import com.mustafazengin.controller.IAdressController;
import com.mustafazengin.dto.DtoAdress;
import com.mustafazengin.dto.DtoCustomer;
import com.mustafazengin.services.IAdressService;
import com.mustafazengin.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/adress")
public class AdressControllerImpl implements IAdressController {

    @Autowired
    private IAdressService adressService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAdress findAdressById(@PathVariable(name = "id") Long id) {

        return adressService.findAdressById(id);

    }

}
