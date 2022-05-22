package com.uphf.archiServices.WSQuery.Repositories;

import com.uphf.archiServices.WSQuery.entities.Patient;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    List<Patient> findByNom(String nom);
}
