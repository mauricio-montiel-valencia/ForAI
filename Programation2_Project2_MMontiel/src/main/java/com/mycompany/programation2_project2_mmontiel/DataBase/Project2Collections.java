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
@javax.persistence.Table(name = "PROJECT2_COLLECTIONS")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Collections.findAll", query = "SELECT p FROM Project2Collections p"),
    @javax.persistence.NamedQuery(name = "Project2Collections.findByCollectionsId", query = "SELECT p FROM Project2Collections p WHERE p.collectionsId = :collectionsId"),
    @javax.persistence.NamedQuery(name = "Project2Collections.findByCollectionName", query = "SELECT p FROM Project2Collections p WHERE p.collectionName = :collectionName"),
    @javax.persistence.NamedQuery(name = "Project2Collections.findByCollectionCentury", query = "SELECT p FROM Project2Collections p WHERE p.collectionCentury = :collectionCentury"),
    @javax.persistence.NamedQuery(name = "Project2Collections.findByCollectionDescription", query = "SELECT p FROM Project2Collections p WHERE p.collectionDescription = :collectionDescription")})
public class Project2Collections implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COLLECTIONS_ID")
    private BigDecimal collectionsId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COLLECTION_NAME")
    private String collectionName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COLLECTION_CENTURY")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date collectionCentury;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COLLECTION_DESCRIPTION")
    private String collectionDescription;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "collectionsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Species> project2SpeciesCollection;

    public Project2Collections() {
    }

    public Project2Collections(BigDecimal collectionsId) {
        this.collectionsId = collectionsId;
    }

    public Project2Collections(BigDecimal collectionsId, String collectionName, Date collectionCentury, String collectionDescription) {
        this.collectionsId = collectionsId;
        this.collectionName = collectionName;
        this.collectionCentury = collectionCentury;
        this.collectionDescription = collectionDescription;
    }

    public BigDecimal getCollectionsId() {
        return collectionsId;
    }

    public void setCollectionsId(BigDecimal collectionsId) {
        this.collectionsId = collectionsId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public Date getCollectionCentury() {
        return collectionCentury;
    }

    public void setCollectionCentury(Date collectionCentury) {
        this.collectionCentury = collectionCentury;
    }

    public String getCollectionDescription() {
        return collectionDescription;
    }

    public void setCollectionDescription(String collectionDescription) {
        this.collectionDescription = collectionDescription;
    }

    public Project2Rooms getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(Project2Rooms roomsId) {
        this.roomsId = roomsId;
    }

    public Collection<Project2Species> getProject2SpeciesCollection() {
        return project2SpeciesCollection;
    }

    public void setProject2SpeciesCollection(Collection<Project2Species> project2SpeciesCollection) {
        this.project2SpeciesCollection = project2SpeciesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (collectionsId != null ? collectionsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Collections)) {
            return false;
        }
        Project2Collections other = (Project2Collections) object;
        if ((this.collectionsId == null && other.collectionsId != null) || (this.collectionsId != null && !this.collectionsId.equals(other.collectionsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Collections[ collectionsId=" + collectionsId + " ]";
    }
    
}
