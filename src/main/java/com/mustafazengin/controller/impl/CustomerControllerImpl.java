package com.mustafazengin.controller.impl;

import com.mustafazengin.controller.ICustomerController;
import com.mustafazengin.dto.DtoCustomer;
import com.mustafazengin.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    private ICustomerService customerService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoCustomer findCustomerById(@PathVariable(name = "id") Long id) {

        return customerService.findCustomerById(id);    }


}
