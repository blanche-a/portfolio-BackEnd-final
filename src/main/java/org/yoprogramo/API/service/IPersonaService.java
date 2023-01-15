package org.yoprogramo.API.service;

import java.util.List;
import org.yoprogramo.API.model.Persona;

public interface IPersonaService {
    public List<Persona> verPersonas();
    public void agregarPersona(Persona pers);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    public void editarPersona(Persona pers);
}