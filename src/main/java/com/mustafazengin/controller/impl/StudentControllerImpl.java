package com.mustafazengin.controller.impl;

import com.mustafazengin.controller.IStudentController;
import com.mustafazengin.dto.DtoStudent;
import com.mustafazengin.dto.DtoStudentIU;
import com.mustafazengin.entities.Student;
import com.mustafazengin.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/api/student") //base url
public class StudentControllerImpl implements IStudentController {


    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU){

        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping(path = "/list/{id}")
    @Override
    public Optional<Student> getStudentById(@PathVariable(name = "id") Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/delete/{id}")
    @Override
    public void deleteStudent(@PathVariable(name = "id") Integer id) {

        studentService.deleteStudent(id);

    }

    @PutMapping("/update/{id}")
    @Override
    public Student updateStudent(@PathVariable(name = "id") Integer id,@RequestBody Student updateStudent) {

        return studentService.updateStudent(id, updateStudent);
    }

}
