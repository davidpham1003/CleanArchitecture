package com.luongpham.cleanarchitecture.usecases.adapter;

import com.luongpham.cleanarchitecture.entities.Student;

public interface StudentAdapter {
    Student findByName(String name);
}
