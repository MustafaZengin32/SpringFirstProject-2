package com.mustafazengin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudent { //Elemanlar Entity deki field ler ile ayni isimde olmali
                          //Bu class i getter icin kullanicagiz

    private String firstName;

    private String lastName;

}
