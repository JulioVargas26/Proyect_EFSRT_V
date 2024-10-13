package com.proyect.data;

import com.proyect.entity.Catalogo;

public record DTOCatalogoList(Long id_catalogo,
                              String descripcion) {

    public DTOCatalogoList(Catalogo catalogo) {
        this(
                catalogo.getId_catalogo(),
                catalogo.getDescripcion()
        );
    }
}

