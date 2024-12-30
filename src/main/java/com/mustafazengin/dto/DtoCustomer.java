package com.mustafazengin.dto;

import com.mustafazengin.entities.Adress;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCustomer {

    private Long id;

    private String name;

    private DtoAdress address;

}
