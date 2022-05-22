package com.uphf.archiServices.WSQuery.Controllers;

import com.uphf.archiServices.WSQuery.Repositories.PatientRepository;
import com.uphf.archiServices.WSQuery.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientJSONController {

    @Autowired
    private PatientRepository pRepository;

    @GetMapping
    public Iterable findAll() {
        return pRepository.findAll();
    }

    @GetMapping("/nom/{nom}")
    public List<Patient> findByName(@PathVariable String nom) {
        return pRepository.findByNom(nom);
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable Long id) {
        return pRepository.findById(id).get();
    }
}
