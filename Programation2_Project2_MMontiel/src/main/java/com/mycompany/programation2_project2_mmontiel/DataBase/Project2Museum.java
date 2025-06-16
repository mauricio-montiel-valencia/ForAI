/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_MUSEUM")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Museum.findAll", query = "SELECT p FROM Project2Museum p"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumId", query = "SELECT p FROM Project2Museum p WHERE p.museumId = :museumId"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumName", query = "SELECT p FROM Project2Museum p WHERE p.museumName = :museumName"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumType", query = "SELECT p FROM Project2Museum p WHERE p.museumType = :museumType"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumLocation", query = "SELECT p FROM Project2Museum p WHERE p.museumLocation = :museumLocation"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumFundationDate", query = "SELECT p FROM Project2Museum p WHERE p.museumFundationDate = :museumFundationDate"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumDirectoName", query = "SELECT p FROM Project2Museum p WHERE p.museumDirectoName = :museumDirectoName"),
    @javax.persistence.NamedQuery(name = "Project2Museum.findByMuseumWebSite", query = "SELECT p FROM Project2Museum p WHERE p.museumWebSite = :museumWebSite")})
public class Project2Museum implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_ID")
    private BigDecimal museumId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_NAME")
    private String museumName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_TYPE")
    private String museumType;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_LOCATION")
    private String museumLocation;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_FUNDATION_DATE")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date museumFundationDate;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_DIRECTO_NAME")
    private String museumDirectoName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "MUSEUM_WEB_SITE")
    private String museumWebSite;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "museumId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Rooms> project2RoomsCollection;

    public Project2Museum() {
    }

    public Project2Museum(BigDecimal museumId) {
        this.museumId = museumId;
    }

    public Project2Museum(BigDecimal museumId, String museumName, String museumType, String museumLocation, Date museumFundationDate, String museumDirectoName, String museumWebSite) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.museumType = museumType;
        this.museumLocation = museumLocation;
        this.museumFundationDate = museumFundationDate;
        this.museumDirectoName = museumDirectoName;
        this.museumWebSite = museumWebSite;
    }

    public BigDecimal getMuseumId() {
        return museumId;
    }

    public void setMuseumId(BigDecimal museumId) {
        this.museumId = museumId;
    }

    public String getMuseumName() {
        return museumName;
    }

    public void setMuseumName(String museumName) {
        this.museumName = museumName;
    }

    public String getMuseumType() {
        return museumType;
    }

    public void setMuseumType(String museumType) {
        this.museumType = museumType;
    }

    public String getMuseumLocation() {
        return museumLocation;
    }

    public void setMuseumLocation(String museumLocation) {
        this.museumLocation = museumLocation;
    }

    public Date getMuseumFundationDate() {
        return museumFundationDate;
    }

    public void setMuseumFundationDate(Date museumFundationDate) {
        this.museumFundationDate = museumFundationDate;
    }

    public String getMuseumDirectoName() {
        return museumDirectoName;
    }

    public void setMuseumDirectoName(String museumDirectoName) {
        this.museumDirectoName = museumDirectoName;
    }

    public String getMuseumWebSite() {
        return museumWebSite;
    }

    public void setMuseumWebSite(String museumWebSite) {
        this.museumWebSite = museumWebSite;
    }

    public Collection<Project2Rooms> getProject2RoomsCollection() {
        return project2RoomsCollection;
    }

    public void setProject2RoomsCollection(Collection<Project2Rooms> project2RoomsCollection) {
        this.project2RoomsCollection = project2RoomsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (museumId != null ? museumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Museum)) {
            return false;
        }
        Project2Museum other = (Project2Museum) object;
        if ((this.museumId == null && other.museumId != null) || (this.museumId != null && !this.museumId.equals(other.museumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Museum[ museumId=" + museumId + " ]";
    }
    
}
