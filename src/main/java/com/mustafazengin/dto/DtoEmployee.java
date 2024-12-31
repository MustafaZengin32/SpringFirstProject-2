package com.mustafazengin.dto;

import com.mustafazengin.entities.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoEmployee {

    private Long id;

    private String name;

    private DtoDepartment department;
}
