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
import org.yoprogramo.API.model.Experiencia;
import org.yoprogramo.API.service.IExperienciaService;

@CrossOrigin(origins = "https://springboot-blanche-a.koyeb.app")
@RestController
public class ExperienciaController {
    @Autowired
    private IExperienciaService expeServ;
    
    @PreAuthorize("permitAll()")
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expeServ.verExperiencias();
    }
    
    @PostMapping("/agregar/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.agregarExperiencia(expe);
    }
    
    @DeleteMapping("/borrar/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }

    @GetMapping("/buscar/experiencia/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return expeServ.buscarExperiencia(id);
    }
            
    @PutMapping("/editar/experiencia")
    public void editarExperiencia(@RequestBody Experiencia expe) {
        expeServ.editarExperiencia(expe);
    }
}
