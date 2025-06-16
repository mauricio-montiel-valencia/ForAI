/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_PRICES")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Prices.findAll", query = "SELECT p FROM Project2Prices p"),
    @javax.persistence.NamedQuery(name = "Project2Prices.findByPricesId", query = "SELECT p FROM Project2Prices p WHERE p.pricesId = :pricesId"),
    @javax.persistence.NamedQuery(name = "Project2Prices.findByPricesDate", query = "SELECT p FROM Project2Prices p WHERE p.pricesDate = :pricesDate"),
    @javax.persistence.NamedQuery(name = "Project2Prices.findByPricesTicket", query = "SELECT p FROM Project2Prices p WHERE p.pricesTicket = :pricesTicket")})
public class Project2Prices implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "PRICES_ID")
    private BigDecimal pricesId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "PRICES_DATE")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date pricesDate;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "PRICES_TICKET")
    private BigInteger pricesTicket;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "pricesId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Entrance> project2EntranceCollection;

    public Project2Prices() {
    }

    public Project2Prices(BigDecimal pricesId) {
        this.pricesId = pricesId;
    }

    public Project2Prices(BigDecimal pricesId, Date pricesDate, BigInteger pricesTicket) {
        this.pricesId = pricesId;
        this.pricesDate = pricesDate;
        this.pricesTicket = pricesTicket;
    }

    public BigDecimal getPricesId() {
        return pricesId;
    }

    public void setPricesId(BigDecimal pricesId) {
        this.pricesId = pricesId;
    }

    public Date getPricesDate() {
        return pricesDate;
    }

    public void setPricesDate(Date pricesDate) {
        this.pricesDate = pricesDate;
    }

    public BigInteger getPricesTicket() {
        return pricesTicket;
    }

    public void setPricesTicket(BigInteger pricesTicket) {
        this.pricesTicket = pricesTicket;
    }

    public Project2Rooms getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(Project2Rooms roomsId) {
        this.roomsId = roomsId;
    }

    public Collection<Project2Entrance> getProject2EntranceCollection() {
        return project2EntranceCollection;
    }

    public void setProject2EntranceCollection(Collection<Project2Entrance> project2EntranceCollection) {
        this.project2EntranceCollection = project2EntranceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pricesId != null ? pricesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Prices)) {
            return false;
        }
        Project2Prices other = (Project2Prices) object;
        if ((this.pricesId == null && other.pricesId != null) || (this.pricesId != null && !this.pricesId.equals(other.pricesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Prices[ pricesId=" + pricesId + " ]";
    }
    
}
