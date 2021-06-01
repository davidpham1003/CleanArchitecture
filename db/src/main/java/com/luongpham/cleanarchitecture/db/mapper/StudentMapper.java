package com.luongpham.cleanarchitecture.db.mapper;

import com.luongpham.cleanarchitecture.db.model.StudentModel;
import com.luongpham.cleanarchitecture.entities.Student;

public class StudentMapper {

    public static Student toEntity(StudentModel model) {
        if (model == null) {
            return null;
        }

        Student student = new Student();
        student.setName(model.getName());
        student.setAge(model.getAge());

        return student;
    }
}
