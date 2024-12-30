package com.mustafazengin.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU { //Bunu Insert ve Update icin kullanacagim

    @NotEmpty(message = "First Name alani bos birakilamaz!")
    @NotNull(message = "First Name alani null olamaz")
    @Size(min = 3,max = 10,message = "First Name degerinin uzunlugu 3 den az , 10 dan fazla olamaz")
    private String firstName;

    @Size(min = 3,max = 30,message = "Last name minimum 3 ,max 30  karakter olmalidir")
    private String lastName;

    private String birthOfDate;
}
