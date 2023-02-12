package com.example.Test3.controller;

import com.example.Test3.model.IstudentInterface;
import com.example.Test3.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    IstudentInterface studentInterface;
    @PostMapping("/addStudent")
    public String addStudentInDatabase(@RequestBody Student student){
        return studentInterface.addStudent(student);
    }

    @GetMapping("/get_all_students")
    public List<Student> findAll(){
        return studentInterface.findAll();
    }

    @PutMapping("/update_student_department/{id}/{department}")
    public String updateStudent(@PathVariable Integer id, @PathVariable String department){
        List<Integer>me = new ArrayList<>();
        me.add(id);
        return studentInterface.updateStudentDepartment(me,department);
    }

    @DeleteMapping("/delete_student/{id}")
    public String deleteStudentById(@PathVariable Integer id) {
        return studentInterface.deleteStudent(id);
    }
    @GetMapping("/get_student_by_id/{id}")
    public List<Student> getStudentById(@PathVariable Integer id){
        return studentInterface.getStudentById(id);
    }

}
