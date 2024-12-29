package com.mustafazengin.repository;

import com.mustafazengin.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Repo sinifi oldugunu belirtmek icin
public interface IStudentRepository extends JpaRepository<Student,Integer> {//Sinifi ve PK verdiginin veri tipini yaz


}
