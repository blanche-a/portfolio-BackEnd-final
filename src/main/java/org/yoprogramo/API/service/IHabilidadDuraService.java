package org.yoprogramo.API.service;

import java.util.List;
import org.yoprogramo.API.model.HabilidadDura;

public interface IHabilidadDuraService {
    public List<HabilidadDura> verHabilidadesDuras();
    public void agregarHabilidadDura(HabilidadDura habdura);
    public void borrarHabilidadDura(Long id);
    public HabilidadDura buscarHabilidadDura(Long id);
    public void editarHabilidadDura(HabilidadDura habdura);
}
