package org.yoprogramo.API.service;

import java.util.List;
import org.yoprogramo.API.model.Experiencia;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void agregarExperiencia(Experiencia expe);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    public void editarExperiencia(Experiencia expe);
}
