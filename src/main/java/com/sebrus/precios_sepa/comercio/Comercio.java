package com.sebrus.precios_sepa.comercio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "comercio")
public class Comercio {

    @Id
    @Column(name = "id_comercio")
    private Integer idComercio;

    @Column(name = "id_bandera")
    private Integer idBandera;

    @Column(name = "comercio_cuit")
    private String comercioCuit;

    @Column(name="comercio_razon_social")
    private String comercioRazonSocial;

    @Column(name="comercio_bandera_nombre")
    private String comercioBanderaNombre;

    @Column(name="comercio_bandera_url")
    private String comercioBanderaUrl;

    @Column(name="comercio_ultima_actualizacion")
    private String comercioUltimaActualizacion;

    @Column(name="comercio_version_sepa")
    private Double comercioVersionSepa;

    public Comercio() {
    }

    public Comercio(Integer id_comercio, Integer id_bandera, String comercio_cuit, String comercio_razon_social, String comercio_bandera_nombre, String comercio_bandera_url, String comercio_ultima_actualizacion, Double comercio_version_sepa) {
        this.idComercio = id_comercio;
        this.idBandera = id_bandera;
        this.comercioCuit = comercio_cuit;
        this.comercioRazonSocial = comercio_razon_social;
        this.comercioBanderaNombre = comercio_bandera_nombre;
        this.comercioBanderaUrl = comercio_bandera_url;
        this.comercioUltimaActualizacion = comercio_ultima_actualizacion;
        this.comercioVersionSepa = comercio_version_sepa;
    }

    public Integer getIdComercio() {
        return idComercio;
    }

    public void setIdComercio(Integer id_comercio) {
        this.idComercio = id_comercio;
    }

    public Integer getIdBandera() {
        return idBandera;
    }

    public void setIdBandera(Integer id_bandera) {
        this.idBandera = id_bandera;
    }

    public String getComercioCuit() {
        return comercioCuit;
    }

    public void setComercioCuit(String comercio_cuit) {
        this.comercioCuit = comercio_cuit;
    }

    public String getComercioRazonSocial() {
        return comercioRazonSocial;
    }

    public void setComercioRazonSocial(String comercioRazonSocial) {
        this.comercioRazonSocial = comercioRazonSocial;
    }

    public String getComercioBanderaNombre() {
        return comercioBanderaNombre;
    }

    public void setComercioBanderaNombre(String comercioBanderaNombre) {
        this.comercioBanderaNombre = comercioBanderaNombre;
    }

    public String getComercioBanderaUrl() {
        return comercioBanderaUrl;
    }

    public void setComercioBanderaUrl(String comercioBanderaUrl) {
        this.comercioBanderaUrl = comercioBanderaUrl;
    }

    public String getComercioUltimaActualizacion() {
        return comercioUltimaActualizacion;
    }

    public void setComercioUltimaActualizacion(String comercioUltimaActualizacion) {
        this.comercioUltimaActualizacion = comercioUltimaActualizacion;
    }

    public Double getComercioVersionSepa() {
        return comercioVersionSepa;
    }

    public void setComercioVersionSepa(Double comercioVersionSepa) {
        this.comercioVersionSepa = comercioVersionSepa;
    }
}
