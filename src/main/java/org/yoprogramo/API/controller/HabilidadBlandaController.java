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
import org.yoprogramo.API.model.HabilidadBlanda;
import org.yoprogramo.API.service.IHabilidadBlandaService;

@RestController
@CrossOrigin(origins = "https://springboot-blanche-a.koyeb.app")
public class HabilidadBlandaController {
    
    @Autowired
    private IHabilidadBlandaService habblandaServ;
    
    @GetMapping("/ver/habilidades-blandas")
    @ResponseBody
    public List<HabilidadBlanda> verHabilidadesBlandas(){
        return habblandaServ.verHabilidadesBlandas();
    }
    
    @PostMapping("/agregar/habilidad-blanda")
    public void agregarHabilidadBlanda(@RequestBody HabilidadBlanda habblanda) {
        habblandaServ.agregarHabilidadBlanda(habblanda);
    }
    @DeleteMapping("/borrar/habilidad-blanda/{id}")
    public void borrarHabilidadBlanda(@PathVariable Long id) {
        habblandaServ.borrarHabilidadBlanda(id);
    }

    @GetMapping("/buscar/habilidad-blanda/{id}")
    @ResponseBody
    public HabilidadBlanda buscarHabilidadBlanda(@PathVariable Long id) {
        return habblandaServ.buscarHabilidadBlanda(id);
    }
            
    @PutMapping("/editar/habilidad-blanda")
    public void editarHabilidadBlanda(@RequestBody HabilidadBlanda habblanda) {
        habblandaServ.editarHabilidadBlanda(habblanda);
    }
}
