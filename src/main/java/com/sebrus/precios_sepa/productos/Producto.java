package com.sebrus.precios_sepa.productos;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="productos")
public class Producto {


//    @Column(name="id_producto")
//    private Integer idProducto;
//
//    @Column(name="id_comercio")
//    private Integer idComercio;
//
//    @Column(name="id_bandera")
//    private Integer idBandera;
//
//    @Column(name="id_sucursal")
//    private Integer idSucursal;
//
//    @Column(name="productos_ean")
//    private String productosEan;

    @EmbeddedId
    private ProductoId id;

    @Column(name = "productos_descripcion")
    private String productosDescripcion;

    @Column(name = "productos_cantidad_presentacion")
    private BigDecimal productosCantidadPresentacion;

    @Column(name = "productos_unidad_medida_presente")
    private String productosUnidadMedidaPresente;

    @Column(name = "productos_marca")
    private String productosMarca;

    @Column(name = "productos_precio_lista")
    private BigDecimal productosPrecioLista;

    @Column(name = "productos_precio_referencia")
    private BigDecimal productosPrecioReferencia;

    @Column(name = "productos_cantidad_referencia")
    private BigDecimal productosCantidadReferencia;

    @Column(name = "productos_unidad_medida_referencia")
    private String productosUnidadMedidaReferencia;

    @Column(name = "productos_precio_unitario_promo1")
    private BigDecimal productosPrecioUnitarioPromo1;

    @Column(name = "productos_leyenda_promo1")
    private String productosLeyendaPromo1;

    @Column(name = "productos_precio_unitario_promo2")
    private BigDecimal productosPrecioUnitarioPromo2;

    @Column(name = "productos_leyenda_promo2")
    private String productosLeyendaPromo2;

    public Producto() {
    }

    public Producto(ProductoId id, String productosDescripcion, BigDecimal productosCantidadPresentacion, String productosUnidadMedidaPresente, String productosMarca, BigDecimal productosPrecioLista, BigDecimal productosPrecioReferencia, BigDecimal productosCantidadReferencia, String productosUnidadMedidaReferencia, BigDecimal productosPrecioUnitarioPromo1, String productosLeyendaPromo1, BigDecimal productosPrecioUnitarioPromo2, String productosLeyendaPromo2) {
        this.id = id;
        this.productosDescripcion = productosDescripcion;
        this.productosCantidadPresentacion = productosCantidadPresentacion;
        this.productosUnidadMedidaPresente = productosUnidadMedidaPresente;
        this.productosMarca = productosMarca;
        this.productosPrecioLista = productosPrecioLista;
        this.productosPrecioReferencia = productosPrecioReferencia;
        this.productosCantidadReferencia = productosCantidadReferencia;
        this.productosUnidadMedidaReferencia = productosUnidadMedidaReferencia;
        this.productosPrecioUnitarioPromo1 = productosPrecioUnitarioPromo1;
        this.productosLeyendaPromo1 = productosLeyendaPromo1;
        this.productosPrecioUnitarioPromo2 = productosPrecioUnitarioPromo2;
        this.productosLeyendaPromo2 = productosLeyendaPromo2;
    }

    public ProductoId getId() {
        return id;
    }

    public void setId(ProductoId id) {
        this.id = id;
    }

    public String getProductosDescripcion() {
        return productosDescripcion;
    }

    public void setProductosDescripcion(String productosDescripcion) {
        this.productosDescripcion = productosDescripcion;
    }

    public BigDecimal getProductosCantidadPresentacion() {
        return productosCantidadPresentacion;
    }

    public void setProductosCantidadPresentacion(BigDecimal productosCantidadPresentacion) {
        this.productosCantidadPresentacion = productosCantidadPresentacion;
    }

    public String getProductosUnidadMedidaPresente() {
        return productosUnidadMedidaPresente;
    }

    public void setProductosUnidadMedidaPresente(String productosUnidadMedidaPresente) {
        this.productosUnidadMedidaPresente = productosUnidadMedidaPresente;
    }

    public String getProductosMarca() {
        return productosMarca;
    }

    public void setProductosMarca(String productosMarca) {
        this.productosMarca = productosMarca;
    }

    public BigDecimal getProductosPrecioLista() {
        return productosPrecioLista;
    }

    public void setProductosPrecioLista(BigDecimal productosPrecioLista) {
        this.productosPrecioLista = productosPrecioLista;
    }

    public BigDecimal getProductosPrecioReferencia() {
        return productosPrecioReferencia;
    }

    public void setProductosPrecioReferencia(BigDecimal productosPrecioReferencia) {
        this.productosPrecioReferencia = productosPrecioReferencia;
    }

    public BigDecimal getProductosCantidadReferencia() {
        return productosCantidadReferencia;
    }

    public void setProductosCantidadReferencia(BigDecimal productosCantidadReferencia) {
        this.productosCantidadReferencia = productosCantidadReferencia;
    }

    public String getProductosUnidadMedidaReferencia() {
        return productosUnidadMedidaReferencia;
    }

    public void setProductosUnidadMedidaReferencia(String productosUnidadMedidaReferencia) {
        this.productosUnidadMedidaReferencia = productosUnidadMedidaReferencia;
    }

    public BigDecimal getProductosPrecioUnitarioPromo1() {
        return productosPrecioUnitarioPromo1;
    }

    public void setProductosPrecioUnitarioPromo1(BigDecimal productosPrecioUnitarioPromo1) {
        this.productosPrecioUnitarioPromo1 = productosPrecioUnitarioPromo1;
    }

    public String getProductosLeyendaPromo1() {
        return productosLeyendaPromo1;
    }

    public void setProductosLeyendaPromo1(String productosLeyendaPromo1) {
        this.productosLeyendaPromo1 = productosLeyendaPromo1;
    }

    public BigDecimal getProductosPrecioUnitarioPromo2() {
        return productosPrecioUnitarioPromo2;
    }

    public void setProductosPrecioUnitarioPromo2(BigDecimal productosPrecioUnitarioPromo2) {
        this.productosPrecioUnitarioPromo2 = productosPrecioUnitarioPromo2;
    }

    public String getProductosLeyendaPromo2() {
        return productosLeyendaPromo2;
    }

    public void setProductosLeyendaPromo2(String productosLeyendaPromo2) {
        this.productosLeyendaPromo2 = productosLeyendaPromo2;
    }
}
