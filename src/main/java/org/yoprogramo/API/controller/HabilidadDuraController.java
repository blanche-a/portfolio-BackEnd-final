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
import org.yoprogramo.API.model.HabilidadDura;
import org.yoprogramo.API.service.IHabilidadDuraService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadDuraController {
    
    @Autowired
    private IHabilidadDuraService habduraServ;
    
    @GetMapping("/ver/habilidades-duras")
    @ResponseBody
    public List<HabilidadDura> verHabilidadesDuras(){
        return habduraServ.verHabilidadesDuras();
    }
    
    @PostMapping("/agregar/habilidad-dura")
    public void agregarHabilidadDura(@RequestBody HabilidadDura habdura) {
        habduraServ.agregarHabilidadDura(habdura);
    }
    @DeleteMapping("/borrar/habilidad-dura/{id}")
    public void borrarHabilidadDura(@PathVariable Long id) {
        habduraServ.borrarHabilidadDura(id);
    }

    @GetMapping("/buscar/habilidad-dura/{id}")
    @ResponseBody
    public HabilidadDura buscarHabilidadDura(@PathVariable Long id) {
        return habduraServ.buscarHabilidadDura(id);
    }
            
    @PutMapping("/editar/habilidad-dura")
    public void editarHabilidadDura(@RequestBody HabilidadDura habdura) {
        habduraServ.editarHabilidadDura(habdura);
    }
}
