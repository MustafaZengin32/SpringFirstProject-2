package com.mustafazengin.services;


import com.mustafazengin.dto.DtoStudent;
import com.mustafazengin.dto.DtoStudentIU;
import com.mustafazengin.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<Student> getAllStudents();

    public Optional<Student> getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public Student updateStudent(Integer id,Student updateStudent);





}
