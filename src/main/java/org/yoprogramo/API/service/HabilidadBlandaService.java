package org.yoprogramo.API.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoprogramo.API.model.HabilidadBlanda;
import org.yoprogramo.API.repository.HabilidadBlandaRepository;

@Service
public class HabilidadBlandaService implements IHabilidadBlandaService {
    
    @Autowired
    public HabilidadBlandaRepository duraRepo;

    @Override
    public List<HabilidadBlanda> verHabilidadesBlandas() {
        return duraRepo.findAll();
    }

    @Override
    public void agregarHabilidadBlanda(HabilidadBlanda habblanda) {
        duraRepo.save(habblanda);
    }

    @Override
    public void borrarHabilidadBlanda(Long id) {
        duraRepo.deleteById(id);
    }

    @Override
    public HabilidadBlanda buscarHabilidadBlanda(Long id) {
        return duraRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidadBlanda(HabilidadBlanda habblanda) {
        duraRepo.save(habblanda);
    }
    
}