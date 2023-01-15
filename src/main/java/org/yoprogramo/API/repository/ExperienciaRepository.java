package org.yoprogramo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoprogramo.API.model.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
