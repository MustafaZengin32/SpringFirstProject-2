package com.mustafazengin.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> { //Response u standardize ediyoruz

    private String id;

    private Date errorTime;

    private T errors;



}
