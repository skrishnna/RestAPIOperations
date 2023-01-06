package com.springboot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.rest.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
