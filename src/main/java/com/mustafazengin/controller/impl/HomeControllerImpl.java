package com.mustafazengin.controller.impl;

import com.mustafazengin.controller.IHomeController;
import com.mustafazengin.dto.DtoHome;
import com.mustafazengin.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home") //base url
public class HomeControllerImpl implements IHomeController {

    @Autowired
    private IHomeService homeService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoHome findHomeById(@PathVariable(name="id") Long id) {

        return homeService.findHomeById(id);
    }
}
