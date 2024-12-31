package com.mustafazengin.controller;

import com.mustafazengin.dto.DtoHome;

public interface IHomeController {


    public DtoHome findHomeById(Long id);
}
