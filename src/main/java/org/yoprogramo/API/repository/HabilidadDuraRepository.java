package org.yoprogramo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoprogramo.API.model.HabilidadDura;

@Repository
public interface HabilidadDuraRepository extends JpaRepository<HabilidadDura, Long>{
    
}
