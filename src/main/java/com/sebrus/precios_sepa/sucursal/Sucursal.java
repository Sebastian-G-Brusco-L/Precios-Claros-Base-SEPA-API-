package com.sebrus.precios_sepa.sucursal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sucursales")
public class Sucursal {

    @Id
    @Column(name = "id_sucursal")
    private Integer idSucursal;

    @Column(name = "id_comercio")
    private Integer idComercio;

    @Column(name = "id_bandera")
    private Integer idBandera;

    @Column(name = "sucursales_nombre")
    private String sucursalesNombre;

    @Column(name = "sucursales_tipo")
    private String sucursalesTipo;

    @Column(name = "sucursales_calle")
    private String sucursalesCalle;

    @Column(name = "sucursales_numero")
    private String sucursalesNumero;

    @Column(name = "sucursales_latitud")
    private String sucursalesLatitud;

    @Column(name = "sucursales_longitud")
    private String sucursalesLongitud;

    @Column(name = "sucursales_observaciones")
    private String sucursalesObservaciones;

    @Column(name = "sucursales_barrio")
    private String sucursalesBarrio;

    @Column(name = "sucursales_codigo_postal")
    private String sucursalesCodigoPostal;

    @Column(name = "sucursales_localidad")
    private String sucursalesLocalidad;

    @Column(name = "sucursales_provincia")
    private String sucursalesProvincia;

    @Column(name = "sucursales_lunes_horario_atencion")
    private String sucursalesLunesHorarioAtencion;

    @Column(name = "sucursales_martes_horario_atencion")
    private String sucursalesMartesHorarioAtencion;

    @Column(name = "sucursales_miercoles_horario_atencion")
    private String sucursalesMiercolesHorarioAtencion;

    @Column(name = "sucursales_jueves_horario_atencion")
    private String sucursalesJuevesHorarioAtencion;

    @Column(name = "sucursales_viernes_horario_atencion")
    private String sucursalesViernesHorarioAtencion;

    @Column(name = "sucursales_sabado_horario_atencion")
    private String sucursalesSabadoHorarioAtencion;

    @Column(name = "sucursales_domingo_horario_atencion")
    private String sucursalesDomingoHorarioAtencion;


    public Sucursal() {
    }

    public Sucursal(Integer idComercio, Integer idBandera, Integer idSucursal, String sucursalesNombre, String sucursalesTipo, String sucursalesCalle, String sucursalesNumero, String sucursalesLatitud, String sucursalesLongitud, String sucursalesObservaciones, String sucursalesBarrio, String sucursalesCodigoPostal, String sucursalesLocalidad, String sucursalesProvincia, String sucursalesLunesHorarioAtencion, String sucursalesMartesHorarioAtencion, String sucursalesMiercolesHorarioAtencion, String sucursalesJuevesHorarioAtencion, String sucursalesViernesHorarioAtencion, String sucursalesSabadoHorarioAtencion, String sucursalesDomingoHorarioAtencion) {
        this.idComercio = idComercio;
        this.idBandera = idBandera;
        this.idSucursal = idSucursal;
        this.sucursalesNombre = sucursalesNombre;
        this.sucursalesTipo = sucursalesTipo;
        this.sucursalesCalle = sucursalesCalle;
        this.sucursalesNumero = sucursalesNumero;
        this.sucursalesLatitud = sucursalesLatitud;
        this.sucursalesLongitud = sucursalesLongitud;
        this.sucursalesObservaciones = sucursalesObservaciones;
        this.sucursalesBarrio = sucursalesBarrio;
        this.sucursalesCodigoPostal = sucursalesCodigoPostal;
        this.sucursalesLocalidad = sucursalesLocalidad;
        this.sucursalesProvincia = sucursalesProvincia;
        this.sucursalesLunesHorarioAtencion = sucursalesLunesHorarioAtencion;
        this.sucursalesMartesHorarioAtencion = sucursalesMartesHorarioAtencion;
        this.sucursalesMiercolesHorarioAtencion = sucursalesMiercolesHorarioAtencion;
        this.sucursalesJuevesHorarioAtencion = sucursalesJuevesHorarioAtencion;
        this.sucursalesViernesHorarioAtencion = sucursalesViernesHorarioAtencion;
        this.sucursalesSabadoHorarioAtencion = sucursalesSabadoHorarioAtencion;
        this.sucursalesDomingoHorarioAtencion = sucursalesDomingoHorarioAtencion;
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

    public String getSucursalesNombre() {
        return sucursalesNombre;
    }

    public void setSucursalesNombre(String sucursalesNombre) {
        this.sucursalesNombre = sucursalesNombre;
    }

    public String getSucursalesTipo() {
        return sucursalesTipo;
    }

    public void setSucursalesTipo(String sucursalesTipo) {
        this.sucursalesTipo = sucursalesTipo;
    }

    public String getSucursalesCalle() {
        return sucursalesCalle;
    }

    public void setSucursalesCalle(String sucursalesCalle) {
        this.sucursalesCalle = sucursalesCalle;
    }

    public String getSucursalesNumero() {
        return sucursalesNumero;
    }

    public void setSucursalesNumero(String sucursalesNumero) {
        this.sucursalesNumero = sucursalesNumero;
    }

    public String getSucursalesLatitud() {
        return sucursalesLatitud;
    }

    public void setSucursalesLatitud(String sucursalesLatitud) {
        this.sucursalesLatitud = sucursalesLatitud;
    }

    public String getSucursalesLongitud() {
        return sucursalesLongitud;
    }

    public void setSucursalesLongitud(String sucursalesLongitud) {
        this.sucursalesLongitud = sucursalesLongitud;
    }

    public String getSucursalesObservaciones() {
        return sucursalesObservaciones;
    }

    public void setSucursalesObservaciones(String sucursalesObservaciones) {
        this.sucursalesObservaciones = sucursalesObservaciones;
    }

    public String getSucursalesBarrio() {
        return sucursalesBarrio;
    }

    public void setSucursalesBarrio(String sucursalesBarrio) {
        this.sucursalesBarrio = sucursalesBarrio;
    }

    public String getSucursalesCodigoPostal() {
        return sucursalesCodigoPostal;
    }

    public void setSucursalesCodigoPostal(String sucursalesCodigoPostal) {
        this.sucursalesCodigoPostal = sucursalesCodigoPostal;
    }

    public String getSucursalesLocalidad() {
        return sucursalesLocalidad;
    }

    public void setSucursalesLocalidad(String sucursalesLocalidad) {
        this.sucursalesLocalidad = sucursalesLocalidad;
    }

    public String getSucursalesProvincia() {
        return sucursalesProvincia;
    }

    public void setSucursalesProvincia(String sucursalesProvincia) {
        this.sucursalesProvincia = sucursalesProvincia;
    }

    public String getSucursalesLunesHorarioAtencion() {
        return sucursalesLunesHorarioAtencion;
    }

    public void setSucursalesLunesHorarioAtencion(String sucursalesLunesHorarioAtencion) {
        this.sucursalesLunesHorarioAtencion = sucursalesLunesHorarioAtencion;
    }

    public String getSucursalesMartesHorarioAtencion() {
        return sucursalesMartesHorarioAtencion;
    }

    public void setSucursalesMartesHorarioAtencion(String sucursalesMartesHorarioAtencion) {
        this.sucursalesMartesHorarioAtencion = sucursalesMartesHorarioAtencion;
    }

    public String getSucursalesMiercolesHorarioAtencion() {
        return sucursalesMiercolesHorarioAtencion;
    }

    public void setSucursalesMiercolesHorarioAtencion(String sucursalesMiercolesHorarioAtencion) {
        this.sucursalesMiercolesHorarioAtencion = sucursalesMiercolesHorarioAtencion;
    }

    public String getSucursalesJuevesHorarioAtencion() {
        return sucursalesJuevesHorarioAtencion;
    }

    public void setSucursalesJuevesHorarioAtencion(String sucursalesJuevesHorarioAtencion) {
        this.sucursalesJuevesHorarioAtencion = sucursalesJuevesHorarioAtencion;
    }

    public String getSucursalesViernesHorarioAtencion() {
        return sucursalesViernesHorarioAtencion;
    }

    public void setSucursalesViernesHorarioAtencion(String sucursalesViernesHorarioAtencion) {
        this.sucursalesViernesHorarioAtencion = sucursalesViernesHorarioAtencion;
    }

    public String getSucursalesSabadoHorarioAtencion() {
        return sucursalesSabadoHorarioAtencion;
    }

    public void setSucursalesSabadoHorarioAtencion(String sucursalesSabadoHorarioAtencion) {
        this.sucursalesSabadoHorarioAtencion = sucursalesSabadoHorarioAtencion;
    }

    public String getSucursalesDomingoHorarioAtencion() {
        return sucursalesDomingoHorarioAtencion;
    }

    public void setSucursalesDomingoHorarioAtencion(String sucursalesDomingoHorarioAtencion) {
        this.sucursalesDomingoHorarioAtencion = sucursalesDomingoHorarioAtencion;
    }
}
