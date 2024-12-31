package com.mustafazengin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoHome {

    private Long id;

    private BigDecimal price;

    private List<DtoRoom> rooms=new ArrayList<>();




}
