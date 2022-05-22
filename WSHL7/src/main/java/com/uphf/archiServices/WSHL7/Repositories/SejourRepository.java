package com.uphf.archiServices.WSHL7.Repositories;

import com.uphf.archiServices.WSHL7.entities.Sejour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface SejourRepository extends CrudRepository<Sejour, Long>{

    @Transactional
    @Query("UPDATE Sejour s SET s.dds =:now WHERE s.id =:id")
    Sejour close(Long id, String now);
}
