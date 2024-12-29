package com.mustafazengin.repository;

import com.mustafazengin.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository //Repo sinifi oldugunu belirtmek icin
public interface IStudentRepository extends JpaRepository<Student,Integer> {//Sinifi ve PK verdiginin veri tipini yaz

    //Buralara kendi ozel methodlarimizi da yazabiliriz
    //Ozel sorgularimizi da @Query sorgularimizi yazabiliriz
    //bazi methodlar repo da olmayabilir

    //Db de ki isimle degil de class ismi ve icindeki degerler yazilir
    //Hibernate Query de nativeQuery false olur dolayisyla class isminde arariz
    //Sql de ise nativequery true olur ve db deki tablo ismi ile aratiriz
    @Query(value = "FROM Student",nativeQuery = false)
    List<Student> findAllStudents();

    /*Buda sql sorgusu

    @Query(value = "SELECT*FROM student.student",nativeQuery = true)
    List<Student> findAllStudents();

     */
    @Query(value = "from Student s WHERE s.id = :studentId",nativeQuery=false)
    Optional<Student> findStudentById(Integer studentId);



}
