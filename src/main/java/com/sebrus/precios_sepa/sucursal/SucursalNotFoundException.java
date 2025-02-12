package com.sebrus.precios_sepa.sucursal;

public class SucursalNotFoundException extends RuntimeException {
    public SucursalNotFoundException(Integer id) {
        super("No se encontro la sucursal con el id: "+ id);
    }
}
