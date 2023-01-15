package org.yoprogramo.API.service;

import java.util.List;
import org.yoprogramo.API.model.HabilidadBlanda;

public interface IHabilidadBlandaService {
    public List<HabilidadBlanda> verHabilidadesBlandas();
    public void agregarHabilidadBlanda(HabilidadBlanda habblanda);
    public void borrarHabilidadBlanda(Long id);
    public HabilidadBlanda buscarHabilidadBlanda(Long id);
    public void editarHabilidadBlanda(HabilidadBlanda habblanda);
}