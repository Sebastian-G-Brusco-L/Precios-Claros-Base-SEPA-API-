package com.sebrus.precios_sepa.productos;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductoId implements Serializable {

    private Integer idComercio;
    private Integer idBandera;
    private Integer idSucursal;
    private String productosEan;
    private Long idProducto;


    public ProductoId() {
    }


    public ProductoId(Integer idComercio, Integer idBandera, Integer idSucursal, String productosEan, Long idProducto) {
        this.idComercio = idComercio;
        this.idBandera = idBandera;
        this.idSucursal = idSucursal;
        this.productosEan = productosEan;
        this.idProducto = idProducto;
    }


    public Integer getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(Integer idComercio) {
        this.idComercio = idComercio;
    }

    public Integer getIdBandera() {
        return idBandera;
    }

    public void setIdBandera(Integer idBandera) {
        this.idBandera = idBandera;
    }

    public Integer getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getProductosEan() {
        return productosEan;
    }

    public void setProductosEan(String productosEan) {
        this.productosEan = productosEan;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "ProductoId{" +
                "idComercio=" + idComercio +
                ", idBandera=" + idBandera +
                ", idSucursal=" + idSucursal +
                ", productosEan='" + productosEan + '\'' +
                ", idProducto=" + idProducto +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoId that = (ProductoId) o;
        return Objects.equals(idComercio, that.idComercio) &&
                Objects.equals(idBandera, that.idBandera) &&
                Objects.equals(idSucursal, that.idSucursal) &&
                Objects.equals(productosEan, that.productosEan) &&
                Objects.equals(idProducto, that.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idComercio, idBandera, idSucursal, productosEan, idProducto);
    }
}
