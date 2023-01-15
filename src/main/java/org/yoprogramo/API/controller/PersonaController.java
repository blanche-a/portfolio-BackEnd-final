package org.yoprogramo.API.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yoprogramo.API.model.Persona;
import org.yoprogramo.API.service.IPersonaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PreAuthorize("permitAll()")
    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/agregar/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.agregarPersona(pers);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

    @GetMapping("/buscar/persona/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id) {
        return persoServ.buscarPersona(id);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);
    }
}