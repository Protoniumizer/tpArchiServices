package com.uphf.archiServices.WSInsert.Controllers;

import com.uphf.archiServices.WSInsert.Repositories.SejourRepository;
import com.uphf.archiServices.WSInsert.entities.Sejour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/sejours")
public class SejourJSONController {

    @Autowired
    private SejourRepository sRepository;

    @PostMapping("/")
    public Sejour addSejour(@RequestBody Sejour sejour) {
        return sRepository.save(sejour);
    }

    @PutMapping("/{id}")
    public Sejour closeSejour(@PathVariable Long id){
        String now = LocalDateTime.now().toString();
        return sRepository.close(id, now);
    }

}
