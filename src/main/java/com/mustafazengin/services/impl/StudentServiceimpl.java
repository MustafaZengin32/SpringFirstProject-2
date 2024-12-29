package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoStudent;
import com.mustafazengin.dto.DtoStudentIU;
import com.mustafazengin.entities.Student;
import com.mustafazengin.repository.IStudentRepository;
import com.mustafazengin.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements IStudentService {


    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {

        DtoStudent response = new DtoStudent();

        Student student = new Student();

        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);

        BeanUtils.copyProperties(dbStudent, response);

        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents() {

        List<DtoStudent> dtoList = new ArrayList<>();

        List<Student> studentList = studentRepository.findAll();

        for (Student student : studentList) {
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }

        return dtoList;
    }

    @Override
    public Optional<DtoStudent> getStudentById(Integer id) {

        DtoStudent dto = new DtoStudent();

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {

            Student dbStudent = optional.get();

            BeanUtils.copyProperties(dbStudent, dto);
        }

        return Optional.of(dto);
    }

    @Override
    public void deleteStudent(Integer id) {

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {
            studentRepository.delete(optional.get());
        }


    }

    @Override
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {

        DtoStudent dto = new DtoStudent();

        Optional<Student> optional = studentRepository.findById(id);

        if (optional.isPresent()) {

            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStudentIU.getFirstName());
            dbStudent.setLastName(dtoStudentIU.getLastName());
            dbStudent.setBirthOfDate(dtoStudentIU.getBirthOfDate());

            Student updateStudent = studentRepository.save(dbStudent);

            BeanUtils.copyProperties(updateStudent, dto);

            return dto;
        }

        return null;

    }

}



