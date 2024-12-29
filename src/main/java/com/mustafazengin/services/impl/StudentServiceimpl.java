package com.mustafazengin.services.impl;

import com.mustafazengin.dto.DtoStudent;
import com.mustafazengin.dto.DtoStudentIU;
import com.mustafazengin.entities.Student;
import com.mustafazengin.repository.IStudentRepository;
import com.mustafazengin.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceimpl implements IStudentService {


    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {

        DtoStudent response=new DtoStudent();

        Student student=new Student();

        BeanUtils.copyProperties(dtoStudentIU,student);

        Student dbStudent=studentRepository.save(student);

        BeanUtils.copyProperties(dbStudent,response);

        return response;
    }

    @Override
    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Integer id) {

        return studentRepository.findById(id);
    }

    @Override
    public void deleteStudent(Integer id) {

        Optional<Student> dbstudent = getStudentById(id);

        if (dbstudent.isPresent()) {
            Student student = dbstudent.get();
            studentRepository.deleteById(student.getId());
        }


    }

    @Override
    public Student updateStudent(Integer id, Student updateStudent) {

        Optional<Student> dbStudent = getStudentById(id);


        if (dbStudent.isPresent()) {

            Student student = dbStudent.get();

            student.setFirstName(updateStudent.getFirstName());

            student.setLastName(updateStudent.getLastName());

            student.setBirthOfDate(updateStudent.getBirthOfDate());

            studentRepository.save(student);

            return student;

        }

        return null;
    }


}
