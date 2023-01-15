package org.yoprogramo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoprogramo.API.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
