package com.proyect.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "data_catalogo")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id_data_catalogo")
public class DataCatalogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_data_catalogo;
	private String descripcion;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_catalogo")
	private Catalogo catalogo;
	
}
