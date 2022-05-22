package com.uphf.archiServices.WSInsert.Repositories;

import com.uphf.archiServices.WSInsert.entities.Sejour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface SejourRepository extends CrudRepository<Sejour, Long>{

    @Transactional
    @Query("UPDATE Sejour s SET s.dds =:now WHERE s.id =:id")
    Sejour close(Long id, String now);
}
