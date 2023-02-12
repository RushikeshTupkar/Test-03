package com.example.Test3.repository;

import com.example.Test3.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface IStudentRepository extends JpaRepository<Student,Integer> {

}
