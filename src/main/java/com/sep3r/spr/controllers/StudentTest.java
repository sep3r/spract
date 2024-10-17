package com.sep3r.spr.controllers;

import com.sep3r.spr.entities.StudentEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentTest {

    @GetMapping("student")
    public StudentEntity getStudent() {
       return new StudentEntity(1L, "sepehr", "mirzanezhad fard");
    }

    @GetMapping("students")
    public List<StudentEntity> getAllStudents() {
        List<StudentEntity> students = new ArrayList<>();
        students.add(new StudentEntity(1L, "sepehr", "mirzanezhad fard"));
        students.add(new StudentEntity(2L, "sahar", "mirzanezhad fard"));
        students.add(new StudentEntity(3L, "mona", "zarei"));
        return students;
    }

    @GetMapping("stu")
    public ResponseEntity<StudentEntity> getStudentHttpEntity() {
        return ResponseEntity.ok().body(new StudentEntity(1L, "sepehr", "mirzanezhad fard"));
    }
}
