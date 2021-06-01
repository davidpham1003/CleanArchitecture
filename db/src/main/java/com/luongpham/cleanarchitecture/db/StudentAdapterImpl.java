package com.luongpham.cleanarchitecture.db;

import com.luongpham.cleanarchitecture.entities.Student;
import com.luongpham.cleanarchitecture.usecases.adapter.StudentAdapter;
public class StudentAdapterImpl {
    private StudentAdapter adapter;

    public FindStudentByName(StudentAdapter adapter) {
        this.adapter = adapter;
    }

    public Student find(String name) {
        return adapter.findByName(name);
    }
}
