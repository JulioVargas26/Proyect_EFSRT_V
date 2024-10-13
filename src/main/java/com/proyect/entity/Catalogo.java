package com.proyect.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "catalogo")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_catalogo")
public class Catalogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_catalogo;
	private String descripcion;

}

