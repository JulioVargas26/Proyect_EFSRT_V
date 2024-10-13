package com.proyect.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proyect.util.RolEnlacePK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "rol_enlace")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RolEnlace {

    @EmbeddedId
    private RolEnlacePK id;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol",insertable = false,updatable = false,referencedColumnName ="id_rol")
    private Rol rol;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="id_enlace",insertable = false,updatable = false,referencedColumnName = "id_enlace")
    private Enlace enlace;
}
