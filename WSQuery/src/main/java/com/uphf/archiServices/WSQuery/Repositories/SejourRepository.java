package com.uphf.archiServices.WSQuery.Repositories;

import com.uphf.archiServices.WSQuery.entities.Sejour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SejourRepository extends CrudRepository<Sejour, Long> {
    List<Sejour> findByPatient(Long id);
}
