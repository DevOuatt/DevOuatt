package com.odc.devops2026.services;

import com.odc.devops2026.entites.Students;
import com.odc.devops2026.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    public StudentRepository studentRepository;

    //C
    public Students create(Students s){
        return studentRepository.saveAndFlush(s);
    }

    //R

    public List<Students> findAllStudent(){
        return  studentRepository.findAll();
    }

    //U
    public Students updateStduent( Students s){
        boolean b=true;
        b = studentRepository.existsById(s.getId());
        if(b){
            return studentRepository.saveAndFlush(s);
        }else return new Students();
    }

    //D
    public String deteleStduent( long id){
        boolean b=true;
        String response="";
        b = studentRepository.existsById(id);
        if(b){
            studentRepository.deleteById(id);
            response="l'element exist, supprimer avec succès";
        }else response="element introuvable dans la base ";

        return response;
    }
}
