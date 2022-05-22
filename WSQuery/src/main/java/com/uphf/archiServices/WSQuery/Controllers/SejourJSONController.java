package com.uphf.archiServices.WSQuery.Controllers;

import com.uphf.archiServices.WSQuery.Repositories.SejourRepository;
import com.uphf.archiServices.WSQuery.entities.Sejour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sejours")
public class SejourJSONController {

    @Autowired
    private SejourRepository sRepository;

    @GetMapping
    public Iterable findAll() {
        return sRepository.findAll();
    }

    @GetMapping("/patients/{id}")
    public List<Sejour> findByPatientId(@PathVariable Long id) {
        return sRepository.findByPatient(id);
    }

    @GetMapping("/{id}")
    public Sejour findById(@PathVariable Long id) {
        return sRepository.findById(id).get();
    }
}
