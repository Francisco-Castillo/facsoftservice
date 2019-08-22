/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.facsoftservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "Prestamos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestamos.findAll", query = "SELECT p FROM Prestamos p"),
    @NamedQuery(name = "Prestamos.findByIdprestamo", query = "SELECT p FROM Prestamos p WHERE p.idprestamo = :idprestamo"),
    @NamedQuery(name = "Prestamos.findByMonto", query = "SELECT p FROM Prestamos p WHERE p.monto = :monto"),
    @NamedQuery(name = "Prestamos.findByFechasolicitud", query = "SELECT p FROM Prestamos p WHERE p.fechasolicitud = :fechasolicitud"),
    @NamedQuery(name = "Prestamos.findByCantidadcuotas", query = "SELECT p FROM Prestamos p WHERE p.cantidadcuotas = :cantidadcuotas"),
    @NamedQuery(name = "Prestamos.findByTna", query = "SELECT p FROM Prestamos p WHERE p.tna = :tna"),
    @NamedQuery(name = "Prestamos.findByGastosadmin", query = "SELECT p FROM Prestamos p WHERE p.gastosadmin = :gastosadmin"),
    @NamedQuery(name = "Prestamos.findBySegurovida", query = "SELECT p FROM Prestamos p WHERE p.segurovida = :segurovida"),
    @NamedQuery(name = "Prestamos.findByIva", query = "SELECT p FROM Prestamos p WHERE p.iva = :iva"),
    @NamedQuery(name = "Prestamos.findByObservaciones", query = "SELECT p FROM Prestamos p WHERE p.observaciones = :observaciones"),
    @NamedQuery(name = "Prestamos.findByEstado", query = "SELECT p FROM Prestamos p WHERE p.estado = :estado")})
public class Prestamos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprestamo")
    private Integer idprestamo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "monto")
    private BigDecimal monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechasolicitud")
    @Temporal(TemporalType.DATE)
    private Date fechasolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidadcuotas")
    private int cantidadcuotas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tna")
    private BigDecimal tna;
    @Column(name = "gastosadmin")
    private BigDecimal gastosadmin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "segurovida")
    private BigDecimal segurovida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iva")
    private BigDecimal iva;
    @Size(max = 200)
    @Column(name = "observaciones")
    private String observaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;

    public Prestamos() {
    }

    public Prestamos(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public Prestamos(Integer idprestamo, BigDecimal monto, Date fechasolicitud, int cantidadcuotas, BigDecimal tna, BigDecimal segurovida, BigDecimal iva, int estado) {
        this.idprestamo = idprestamo;
        this.monto = monto;
        this.fechasolicitud = fechasolicitud;
        this.cantidadcuotas = cantidadcuotas;
        this.tna = tna;
        this.segurovida = segurovida;
        this.iva = iva;
        this.estado = estado;
    }

    public Integer getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(Integer idprestamo) {
        this.idprestamo = idprestamo;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechasolicitud() {
        return fechasolicitud;
    }

    public void setFechasolicitud(Date fechasolicitud) {
        this.fechasolicitud = fechasolicitud;
    }

    public int getCantidadcuotas() {
        return cantidadcuotas;
    }

    public void setCantidadcuotas(int cantidadcuotas) {
        this.cantidadcuotas = cantidadcuotas;
    }

    public BigDecimal getTna() {
        return tna;
    }

    public void setTna(BigDecimal tna) {
        this.tna = tna;
    }

    public BigDecimal getGastosadmin() {
        return gastosadmin;
    }

    public void setGastosadmin(BigDecimal gastosadmin) {
        this.gastosadmin = gastosadmin;
    }

    public BigDecimal getSegurovida() {
        return segurovida;
    }

    public void setSegurovida(BigDecimal segurovida) {
        this.segurovida = segurovida;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprestamo != null ? idprestamo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestamos)) {
            return false;
        }
        Prestamos other = (Prestamos) object;
        if ((this.idprestamo == null && other.idprestamo != null) || (this.idprestamo != null && !this.idprestamo.equals(other.idprestamo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fcastillo.facsoftservice.config.Prestamos[ idprestamo=" + idprestamo + " ]";
    }
    
}
