package com.proyect.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "tipo_movimientos")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_tipo_mov")
public class TipoMovimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo_mov;
    private String nombre;




}
