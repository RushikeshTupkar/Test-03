package com.example.Test3.service;


import com.example.Test3.model.IstudentInterface;
import com.example.Test3.model.Student;
import com.example.Test3.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IstudentInterface {
    @Autowired
    IStudentRepository StudentRepository;

    public String addStudent(Student student){
        Student saved = StudentRepository.save(student);
        return "Student added to database";
    }

    @Override
    public String updateStudentDepartment(List<Integer> me, String department) {
        List<Student>st = StudentRepository.findAllById(me);
        Student s1 = st.get(0);
        s1.setDepartment(department);
        s1.setStudentId(s1.getStudentId());
        s1.setFirst_name(s1.getFirst_name());
        s1.setLast_name(s1.getLast_name());
        s1.setAge(s1.getAge());
        StudentRepository.save(s1);
        return "updated";
    }



    @Override
    public List<Student> findAll() {
        return StudentRepository.findAll();
    }

    @Override
    public String deleteStudent(Integer id) {
        StudentRepository.deleteById(id);
        return "Done";
    }

    @Override
    public List<Student> getStudentById(Integer id) {
        List<Integer>me = new ArrayList<>();
        me.add(id);
        List<Student>out =  StudentRepository.findAllById(me);
        return out;
    }
}
