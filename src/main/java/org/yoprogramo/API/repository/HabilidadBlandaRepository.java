package org.yoprogramo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoprogramo.API.model.HabilidadBlanda;

@Repository
public interface HabilidadBlandaRepository extends JpaRepository<HabilidadBlanda, Long> {
    
}
