package com.odc.devops2026.controller;

import com.odc.devops2026.entites.Students;
import com.odc.devops2026.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    public StudentService studentService;

    //C
    @PostMapping("create")
     ResponseEntity<Students> create (@RequestBody Students s){
        return ResponseEntity.ok().body(studentService.create(s));
    }

    //R
    @GetMapping("list")
    ResponseEntity<List<Students>> findAll (){
        return ResponseEntity.ok().body(studentService.findAllStudent());
    }

    //U
    @PostMapping("update")
    ResponseEntity<Students> update (@RequestBody Students s){
        return ResponseEntity.ok().body(studentService.updateStduent(s));
    }
    //D
    @DeleteMapping("delete")
    ResponseEntity<String> delete (@RequestParam long id){
        return ResponseEntity.ok().body(studentService.deteleStduent(id));
    }


}
