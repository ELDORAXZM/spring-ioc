package com.jamie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client implements Person{
    private int id;
    private String name;
    private String clientNo;

}
