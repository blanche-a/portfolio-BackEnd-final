package org.yoprogramo.API.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.yoprogramo.API.model.Educacion;
import org.yoprogramo.API.service.IEducacionService;

@RestController
@CrossOrigin(origins = "https://springboot-blanche-a.koyeb.app")
public class EducacionController {
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping("/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @PostMapping("/agregar/educacion")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.agregarEducacion(edu);
    }
    
    @DeleteMapping("/borrar/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    @GetMapping("/buscar/educacion/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id) {
        return eduServ.buscarEducacion(id);
    }
            
    @PutMapping("/editar/educacion")
    public void editarEducacion(@RequestBody Educacion edu) {
        eduServ.editarEducacion(edu);
    }

}
