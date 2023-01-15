package org.yoprogramo.API.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lugar;
    private String titulo;
    private int inicio;
    private int fin;
    private String logo;
    private String logoAlt;

    public Educacion() {
    }

    public Educacion(Long id, String lugar, String titulo, int inicio, int fin, String logo, String logoAlt) {
        this.id = id;
        this.lugar = lugar;
        this.titulo = titulo;
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
        this.logoAlt = logoAlt;
    }
    
    
}
