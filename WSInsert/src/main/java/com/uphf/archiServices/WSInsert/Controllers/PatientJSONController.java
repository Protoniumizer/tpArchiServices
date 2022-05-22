package com.uphf.archiServices.WSInsert.Controllers;

import com.uphf.archiServices.WSInsert.Repositories.PatientRepository;
import com.uphf.archiServices.WSInsert.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientJSONController {

    @Autowired
    private PatientRepository pRepository;

    @PutMapping("/")
    public Patient updatePatient(@RequestBody Patient patient) {
        return pRepository.save(patient);
    }

}
