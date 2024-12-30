package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoAdress;
import com.mustafazengin.dto.DtoCustomer;
import com.mustafazengin.entities.Adress;
import com.mustafazengin.entities.Customer;
import com.mustafazengin.repository.CustomerRepository;
import com.mustafazengin.services.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public DtoCustomer findCustomerById(Long id) {

        DtoCustomer dtoCustomer=new DtoCustomer();

        DtoAdress dtoAdress=new DtoAdress();

        Optional<Customer> optional = customerRepository.findById(id);

        if (optional.isEmpty()){
            return null;
        }

        Customer customer = optional.get();
        Adress address = optional.get().getAddress();

        BeanUtils.copyProperties(customer,dtoCustomer);
        BeanUtils.copyProperties(address,dtoAdress);

        dtoCustomer.setAddress(dtoAdress);

        return dtoCustomer;
    }
}
