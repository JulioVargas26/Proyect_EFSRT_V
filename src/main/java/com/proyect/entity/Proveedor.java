package com.proyect.entity;

import com.proyect.util.Registros;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "proveedores")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_prov")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prov;

    @Column(unique = true)
    private String ruc;

    private String razon_social;
    private String direccion_fiscal;
    private String condicion_ruc;
    private String estado_ruc;

    private String tipo_contacto;
    private String nombre_contacto;
    private String telefono_contacto;

    @Column(unique = true)
    private String email_contacto;

    @Embedded
    private Registros registros = new Registros();



}
