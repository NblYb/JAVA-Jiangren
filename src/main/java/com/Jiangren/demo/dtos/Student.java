package com.Jiangren.demo.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class Student {
    private String firstName;
    private String secondName;
    private String gender;
    private int age;
}
