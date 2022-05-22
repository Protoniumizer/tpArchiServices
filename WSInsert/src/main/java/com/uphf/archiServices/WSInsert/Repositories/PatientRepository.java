package com.uphf.archiServices.WSInsert.Repositories;

import com.uphf.archiServices.WSInsert.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findByNom(String nom);
}
