package com.mustafazengin.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    //Amac:Spring Validation dan firlatilan hatalari alip yonetmek
    //Response olarak musteri icin anlamli mesajlar donmek

    private List<String>addMapValue(List<String> list,String newValue){

        list.add(newValue);
        return list;
    }


    @ExceptionHandler(value = MethodArgumentNotValidException.class) //firlatilan exception adi
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception){

        Map<String, List<String>> errosMap=new HashMap<>();//Donecek Hatalari almak icin


        for (ObjectError objError : exception.getBindingResult().getAllErrors()) {

            String fieldName = ((FieldError) objError).getField();

            if(errosMap.containsKey(fieldName)){

                errosMap.put(fieldName,addMapValue(errosMap.get(fieldName),objError.getDefaultMessage()));

            }
            else {

                errosMap.put(fieldName,addMapValue(new ArrayList<>(),objError.getDefaultMessage()));
            }
        }

        return ResponseEntity.badRequest().body(createApiError(errosMap));


    }

    private <T> ApiError<T> createApiError(T errors){

        ApiError <T> apiError=new ApiError<T>();
        apiError.setId(UUID.randomUUID().toString());
        apiError.setErrorTime(new Date());
        apiError.setErrors(errors);

        return apiError;

    }

}
