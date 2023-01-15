package org.yoprogramo.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yoprogramo.API.model.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long>{
    
}
