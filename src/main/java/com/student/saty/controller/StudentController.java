package com.student.saty.controller;

import com.student.saty.model.Book;
import com.student.saty.model.Student;
import com.student.saty.model.StudentDao;
import com.student.saty.model.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {


    @Autowired
    StudentDao studentDao;

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("saveStudent")
    public void SaveStudent(@RequestBody Student student){
        studentDao.insertStudent(student);
    }

    @PostMapping("saveStudentByJpa")
    public void SaveStudentByJpa(@RequestBody Student student){
        studentRepo.save(student);
    }

    @GetMapping("allStudent")
    public List<Student> getAllStudent(){
        List<Student> allStudents = studentRepo.findAll();
        return allStudents;
    }

    @GetMapping("getStudentById/{id}")
    public Student getStudentById(@PathVariable Long id){
        Optional<Student> byId = studentRepo.findById(id);
        return byId.get();
    }

    @GetMapping("getBooksById/{id}")
    public List<Book> getBooksById(@PathVariable Long id){
        Student byId = studentRepo.getReferenceById(id);
        return byId.getAllBooks();
    }
}
