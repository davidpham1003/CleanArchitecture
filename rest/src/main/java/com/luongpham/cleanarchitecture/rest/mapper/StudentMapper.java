package com.luongpham.cleanarchitecture.rest.mapper;

import com.luongpham.cleanarchitecture.entities.Student;
import com.luongpham.cleanarchitecture.rest.dto.StudentDto;

public class StudentMapper {

    public static StudentDto toDto(Student entity) {
        if (entity == null) {
            return null;
        }

        StudentDto studentDto = new StudentDto();
        studentDto.setName(entity.getName());
        studentDto.setAge(entity.getAge());

        return studentDto;
    }
}
