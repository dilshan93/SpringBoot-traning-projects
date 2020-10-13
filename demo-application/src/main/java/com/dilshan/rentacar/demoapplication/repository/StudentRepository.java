package com.dilshan.rentacar.demoapplication.repository;

import com.dilshan.rentacar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//    Student save(Student student);
}
