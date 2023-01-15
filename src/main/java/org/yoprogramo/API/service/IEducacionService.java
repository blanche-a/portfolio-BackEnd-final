package org.yoprogramo.API.service;

import java.util.List;
import org.yoprogramo.API.model.Educacion;

public interface IEducacionService {
    public List<Educacion> verEducaciones();
    public void agregarEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    public void editarEducacion(Educacion edu);
}
