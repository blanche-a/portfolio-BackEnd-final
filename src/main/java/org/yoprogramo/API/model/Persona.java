package org.yoprogramo.API.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String titulo;
    
    @Lob
    @Column(name="DESCRIPCION", length=256)
    private String descripcion;
    private String imagen;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String titulo, String descripcion, String imagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    
    
    
}
