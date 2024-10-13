package com.proyect.data;

import com.proyect.entity.DataCatalogo;

public record DTODataCatalogoList(Long id_data_catalogo,
                          String descripcion) {

    public DTODataCatalogoList(DataCatalogo dataCatalogo) {
        this(
                dataCatalogo.getId_data_catalogo(),
                dataCatalogo.getDescripcion()
        );
    }
}
