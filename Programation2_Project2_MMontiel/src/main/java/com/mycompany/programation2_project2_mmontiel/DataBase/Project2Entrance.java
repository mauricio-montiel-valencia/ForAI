/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_ENTRANCE")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Entrance.findAll", query = "SELECT p FROM Project2Entrance p"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceId", query = "SELECT p FROM Project2Entrance p WHERE p.entranceId = :entranceId"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceSale", query = "SELECT p FROM Project2Entrance p WHERE p.entranceSale = :entranceSale"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceDaytovisit", query = "SELECT p FROM Project2Entrance p WHERE p.entranceDaytovisit = :entranceDaytovisit"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceRoomsNames", query = "SELECT p FROM Project2Entrance p WHERE p.entranceRoomsNames = :entranceRoomsNames"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceTotalPrice", query = "SELECT p FROM Project2Entrance p WHERE p.entranceTotalPrice = :entranceTotalPrice"),
    @javax.persistence.NamedQuery(name = "Project2Entrance.findByEntranceQr", query = "SELECT p FROM Project2Entrance p WHERE p.entranceQr = :entranceQr")})
public class Project2Entrance implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_ID")
    private BigDecimal entranceId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_SALE")
    private BigInteger entranceSale;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_DAYTOVISIT")
    private BigInteger entranceDaytovisit;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_ROOMS_NAMES")
    private String entranceRoomsNames;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_TOTAL_PRICE")
    private BigInteger entranceTotalPrice;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ENTRANCE_QR")
    private String entranceQr;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "entranceId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2ComissionRegister> project2ComissionRegisterCollection;
    @javax.persistence.JoinColumn(name = "PRICES_ID", referencedColumnName = "PRICES_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Prices pricesId;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;

    public Project2Entrance() {
    }

    public Project2Entrance(BigDecimal entranceId) {
        this.entranceId = entranceId;
    }

    public Project2Entrance(BigDecimal entranceId, BigInteger entranceSale, BigInteger entranceDaytovisit, String entranceRoomsNames, BigInteger entranceTotalPrice, String entranceQr) {
        this.entranceId = entranceId;
        this.entranceSale = entranceSale;
        this.entranceDaytovisit = entranceDaytovisit;
        this.entranceRoomsNames = entranceRoomsNames;
        this.entranceTotalPrice = entranceTotalPrice;
        this.entranceQr = entranceQr;
    }

    public BigDecimal getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(BigDecimal entranceId) {
        this.entranceId = entranceId;
    }

    public BigInteger getEntranceSale() {
        return entranceSale;
    }

    public void setEntranceSale(BigInteger entranceSale) {
        this.entranceSale = entranceSale;
    }

    public BigInteger getEntranceDaytovisit() {
        return entranceDaytovisit;
    }

    public void setEntranceDaytovisit(BigInteger entranceDaytovisit) {
        this.entranceDaytovisit = entranceDaytovisit;
    }

    public String getEntranceRoomsNames() {
        return entranceRoomsNames;
    }

    public void setEntranceRoomsNames(String entranceRoomsNames) {
        this.entranceRoomsNames = entranceRoomsNames;
    }

    public BigInteger getEntranceTotalPrice() {
        return entranceTotalPrice;
    }

    public void setEntranceTotalPrice(BigInteger entranceTotalPrice) {
        this.entranceTotalPrice = entranceTotalPrice;
    }

    public String getEntranceQr() {
        return entranceQr;
    }

    public void setEntranceQr(String entranceQr) {
        this.entranceQr = entranceQr;
    }

    public Collection<Project2ComissionRegister> getProject2ComissionRegisterCollection() {
        return project2ComissionRegisterCollection;
    }

    public void setProject2ComissionRegisterCollection(Collection<Project2ComissionRegister> project2ComissionRegisterCollection) {
        this.project2ComissionRegisterCollection = project2ComissionRegisterCollection;
    }

    public Project2Prices getPricesId() {
        return pricesId;
    }

    public void setPricesId(Project2Prices pricesId) {
        this.pricesId = pricesId;
    }

    public Project2Rooms getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(Project2Rooms roomsId) {
        this.roomsId = roomsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entranceId != null ? entranceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Entrance)) {
            return false;
        }
        Project2Entrance other = (Project2Entrance) object;
        if ((this.entranceId == null && other.entranceId != null) || (this.entranceId != null && !this.entranceId.equals(other.entranceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Entrance[ entranceId=" + entranceId + " ]";
    }
    
}
