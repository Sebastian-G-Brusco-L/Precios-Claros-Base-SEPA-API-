package com.sebrus.precios_sepa.comercio;

public class ComercioNotFoundException extends RuntimeException {

    public ComercioNotFoundException(Integer id) {
        super("No se encontro el comercio con el id: " + id);
    }
}
