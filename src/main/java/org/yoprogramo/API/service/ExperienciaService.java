package org.yoprogramo.API.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoprogramo.API.model.Experiencia;
import org.yoprogramo.API.repository.ExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expeRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
        return expeRepo.findAll();
    }

    @Override
    public void agregarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expeRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
    
}