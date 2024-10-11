package com.proyect.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.proyect.util.Registros;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "usuarios")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_user")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;
    private String nombre;
    private String apellido_pat;
    private String apellido_mat;

    @Column(unique = true)
    private String email;

    private String login;
    private String password;

    @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idrol")
    private Rol rol;

    @Embedded
    private Registros registros = new Registros();


}
