package com.luongpham.cleanarchitecture.usecases.student;

import com.luongpham.cleanarchitecture.usecases.adapter.StudentAdapter;
import com.luongpham.cleanarchitecture.entities.Student;

public class FindStudentByName {
    private StudentAdapter adapter;

    public FindStudentByName(StudentAdapter adapter) {
        this.adapter = adapter;
    }

    public Student find(String name) {
        return adapter.findByName(name);
    }
}
