package com.dilshan.rentacar.demoapplication.service;

import com.dilshan.rentacar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
