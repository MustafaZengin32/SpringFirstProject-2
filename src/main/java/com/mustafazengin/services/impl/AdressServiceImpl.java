package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoAdress;
import com.mustafazengin.dto.DtoCustomer;
import com.mustafazengin.entities.Adress;
import com.mustafazengin.entities.Customer;
import com.mustafazengin.repository.AdressRepository;
import com.mustafazengin.repository.CustomerRepository;
import com.mustafazengin.services.IAdressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdressServiceImpl implements IAdressService {

    @Autowired
    private AdressRepository adressRepository;

    @Override
    public DtoAdress findAdressById(Long id) {


        DtoAdress dtoAdress=new DtoAdress();

        Optional<Adress> optional = adressRepository.findById(id);

        if (optional.isEmpty()){
            return null;
        }

        Adress adress = optional.get();
        BeanUtils.copyProperties(adress,dtoAdress);

        DtoCustomer dtoCustomer=new DtoCustomer();
        dtoCustomer.setId(adress.getCustomer().getId());
        dtoCustomer.setName(adress.getCustomer().getName());


        dtoAdress.setCustomer(dtoCustomer);

        return dtoAdress;
    }

}

