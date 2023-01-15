package org.yoprogramo.API.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoprogramo.API.model.Educacion;
import org.yoprogramo.API.repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    public EducacionRepository eduRepo;

    @Override
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }

    @Override
    public void agregarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        eduRepo.save(edu);
    }
    
}
