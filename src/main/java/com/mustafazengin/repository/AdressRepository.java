package com.mustafazengin.repository;

import com.mustafazengin.entities.Adress;
import com.mustafazengin.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository<Adress,Long> {


}
