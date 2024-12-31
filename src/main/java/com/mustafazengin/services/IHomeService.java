package com.mustafazengin.services;


import com.mustafazengin.dto.DtoHome;

public interface IHomeService {

    public DtoHome findHomeById(Long id);
}
