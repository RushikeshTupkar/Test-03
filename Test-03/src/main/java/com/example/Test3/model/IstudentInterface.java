package com.example.Test3.model;

import java.util.List;

public interface IstudentInterface {
    String addStudent(Student student);
    String updateStudentDepartment(List<Integer>me,String department);
    List<Student> findAll();
    String deleteStudent(Integer id);

    List<Student> getStudentById(Integer id);
}
