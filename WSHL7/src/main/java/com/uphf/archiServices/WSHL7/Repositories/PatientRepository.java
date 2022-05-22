package com.uphf.archiServices.WSHL7.Repositories;

import com.uphf.archiServices.WSHL7.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findByNom(String nom);
}
