package com.luongpham.cleanarchitecture.rest.dto;

import lombok.Data;

@Data
public class StudentDto {

    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
