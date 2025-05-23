package com.example.hospital.repository;

import com.example.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNomContainsIgnoreCase(String keyword);
}