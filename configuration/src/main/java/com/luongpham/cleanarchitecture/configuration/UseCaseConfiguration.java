package com.luongpham.cleanarchitecture.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luongpham.cleanarchitecture.db.StudentAdapterImpl;
import com.luongpham.cleanarchitecture.usecases.adapter.StudentAdapter;
import com.luongpham.cleanarchitecture.usecases.student.FindStudentByName;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public FindStudentByName findStudentByNameUseCase(StudentAdapter studentAdapter) {
        return new FindStudentByName(studentAdapter);
    }

    @Bean
    public StudentAdapter studentAdapter() {
        return (StudentAdapter) new StudentAdapterImpl();
    }
}