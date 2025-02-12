package com.sebrus.precios_sepa.productos;

public class ProductoNotFoundException extends RuntimeException {
    public ProductoNotFoundException(String id) {
        super("No se encontro el producto con id: " + id);
    }
}
