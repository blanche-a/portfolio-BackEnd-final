package org.yoprogramo.API.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yoprogramo.API.model.HabilidadDura;
import org.yoprogramo.API.repository.HabilidadDuraRepository;

@Service
public class HabilidadDuraService implements IHabilidadDuraService {
    
    @Autowired
    public HabilidadDuraRepository duraRepo;

    @Override
    public List<HabilidadDura> verHabilidadesDuras() {
        return duraRepo.findAll();
    }

    @Override
    public void agregarHabilidadDura(HabilidadDura habdura) {
        duraRepo.save(habdura);
    }

    @Override
    public void borrarHabilidadDura(Long id) {
        duraRepo.deleteById(id);
    }

    @Override
    public HabilidadDura buscarHabilidadDura(Long id) {
        return duraRepo.findById(id).orElse(null);
    }

    @Override
    public void editarHabilidadDura(HabilidadDura habdura) {
        duraRepo.save(habdura);
    }
    
}
