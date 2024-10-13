package com.proyect.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Table(name = "enlaces")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_enlace")
public class Enlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_enlace;
    private String nombre;
    private String url;
    //private String icono;
    private String descripcion;

    @JsonBackReference
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "enlace")
    private List<RolEnlace> listaRolEnlace;

}
