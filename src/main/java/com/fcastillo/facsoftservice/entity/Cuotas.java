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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "Cuotas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuotas.findAll", query = "SELECT c FROM Cuotas c"),
    @NamedQuery(name = "Cuotas.findByIdcuota", query = "SELECT c FROM Cuotas c WHERE c.idcuota = :idcuota"),
    @NamedQuery(name = "Cuotas.findByNrocuota", query = "SELECT c FROM Cuotas c WHERE c.nrocuota = :nrocuota"),
    @NamedQuery(name = "Cuotas.findByValor", query = "SELECT c FROM Cuotas c WHERE c.valor = :valor"),
    @NamedQuery(name = "Cuotas.findByFechavencimiento", query = "SELECT c FROM Cuotas c WHERE c.fechavencimiento = :fechavencimiento"),
    @NamedQuery(name = "Cuotas.findByEstado", query = "SELECT c FROM Cuotas c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cuotas.findByIdprestamo", query = "SELECT c FROM Cuotas c WHERE c.idprestamo = :idprestamo")})
public class Cuotas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcuota")
    private Integer idcuota;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nrocuota")
    private int nrocuota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechavencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechavencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idprestamo")
    private int idprestamo;

    public Cuotas() {
    }

    public Cuotas(Integer idcuota) {
        this.idcuota = idcuota;
    }

    public Cuotas(Integer idcuota, int nrocuota, Date fechavencimiento, int estado, int idprestamo) {
        this.idcuota = idcuota;
        this.nrocuota = nrocuota;
        this.fechavencimiento = fechavencimiento;
        this.estado = estado;
        this.idprestamo = idprestamo;
    }

    public Integer getIdcuota() {
        return idcuota;
    }

    public void setIdcuota(Integer idcuota) {
        this.idcuota = idcuota;
    }

    public int getNrocuota() {
        return nrocuota;
    }

    public void setNrocuota(int nrocuota) {
        this.nrocuota = nrocuota;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdprestamo() {
        return idprestamo;
    }

    public void setIdprestamo(int idprestamo) {
        this.idprestamo = idprestamo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcuota != null ? idcuota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuotas)) {
            return false;
        }
        Cuotas other = (Cuotas) object;
        if ((this.idcuota == null && other.idcuota != null) || (this.idcuota != null && !this.idcuota.equals(other.idcuota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fcastillo.facsoftservice.config.Cuotas[ idcuota=" + idcuota + " ]";
    }
    
}
