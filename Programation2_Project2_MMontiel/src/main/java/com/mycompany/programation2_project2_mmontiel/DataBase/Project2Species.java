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
@javax.persistence.Table(name = "PROJECT2_SPECIES")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Species.findAll", query = "SELECT p FROM Project2Species p"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesId", query = "SELECT p FROM Project2Species p WHERE p.speciesId = :speciesId"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesScientificName", query = "SELECT p FROM Project2Species p WHERE p.speciesScientificName = :speciesScientificName"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesPopularName", query = "SELECT p FROM Project2Species p WHERE p.speciesPopularName = :speciesPopularName"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesExtinctionDate", query = "SELECT p FROM Project2Species p WHERE p.speciesExtinctionDate = :speciesExtinctionDate"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesEraLived", query = "SELECT p FROM Project2Species p WHERE p.speciesEraLived = :speciesEraLived"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesWeight", query = "SELECT p FROM Project2Species p WHERE p.speciesWeight = :speciesWeight"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesHeight", query = "SELECT p FROM Project2Species p WHERE p.speciesHeight = :speciesHeight"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesPrincipalCharacteristics", query = "SELECT p FROM Project2Species p WHERE p.speciesPrincipalCharacteristics = :speciesPrincipalCharacteristics"),
    @javax.persistence.NamedQuery(name = "Project2Species.findBySpeciesImage", query = "SELECT p FROM Project2Species p WHERE p.speciesImage = :speciesImage")})
public class Project2Species implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_ID")
    private BigDecimal speciesId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_SCIENTIFIC_NAME")
    private String speciesScientificName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_POPULAR_NAME")
    private String speciesPopularName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_EXTINCTION_DATE")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date speciesExtinctionDate;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_ERA_LIVED")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date speciesEraLived;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_WEIGHT")
    private BigInteger speciesWeight;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_HEIGHT")
    private BigInteger speciesHeight;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_PRINCIPAL_CHARACTERISTICS")
    private String speciesPrincipalCharacteristics;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "SPECIES_IMAGE")
    private String speciesImage;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "speciesId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2ChipsRooms> project2ChipsRoomsCollection;
    @javax.persistence.JoinColumn(name = "COLLECTIONS_ID", referencedColumnName = "COLLECTIONS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Collections collectionsId;

    public Project2Species() {
    }

    public Project2Species(BigDecimal speciesId) {
        this.speciesId = speciesId;
    }

    public Project2Species(BigDecimal speciesId, String speciesScientificName, String speciesPopularName, Date speciesExtinctionDate, Date speciesEraLived, BigInteger speciesWeight, BigInteger speciesHeight, String speciesPrincipalCharacteristics, String speciesImage) {
        this.speciesId = speciesId;
        this.speciesScientificName = speciesScientificName;
        this.speciesPopularName = speciesPopularName;
        this.speciesExtinctionDate = speciesExtinctionDate;
        this.speciesEraLived = speciesEraLived;
        this.speciesWeight = speciesWeight;
        this.speciesHeight = speciesHeight;
        this.speciesPrincipalCharacteristics = speciesPrincipalCharacteristics;
        this.speciesImage = speciesImage;
    }

    public BigDecimal getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(BigDecimal speciesId) {
        this.speciesId = speciesId;
    }

    public String getSpeciesScientificName() {
        return speciesScientificName;
    }

    public void setSpeciesScientificName(String speciesScientificName) {
        this.speciesScientificName = speciesScientificName;
    }

    public String getSpeciesPopularName() {
        return speciesPopularName;
    }

    public void setSpeciesPopularName(String speciesPopularName) {
        this.speciesPopularName = speciesPopularName;
    }

    public Date getSpeciesExtinctionDate() {
        return speciesExtinctionDate;
    }

    public void setSpeciesExtinctionDate(Date speciesExtinctionDate) {
        this.speciesExtinctionDate = speciesExtinctionDate;
    }

    public Date getSpeciesEraLived() {
        return speciesEraLived;
    }

    public void setSpeciesEraLived(Date speciesEraLived) {
        this.speciesEraLived = speciesEraLived;
    }

    public BigInteger getSpeciesWeight() {
        return speciesWeight;
    }

    public void setSpeciesWeight(BigInteger speciesWeight) {
        this.speciesWeight = speciesWeight;
    }

    public BigInteger getSpeciesHeight() {
        return speciesHeight;
    }

    public void setSpeciesHeight(BigInteger speciesHeight) {
        this.speciesHeight = speciesHeight;
    }

    public String getSpeciesPrincipalCharacteristics() {
        return speciesPrincipalCharacteristics;
    }

    public void setSpeciesPrincipalCharacteristics(String speciesPrincipalCharacteristics) {
        this.speciesPrincipalCharacteristics = speciesPrincipalCharacteristics;
    }

    public String getSpeciesImage() {
        return speciesImage;
    }

    public void setSpeciesImage(String speciesImage) {
        this.speciesImage = speciesImage;
    }

    public Collection<Project2ChipsRooms> getProject2ChipsRoomsCollection() {
        return project2ChipsRoomsCollection;
    }

    public void setProject2ChipsRoomsCollection(Collection<Project2ChipsRooms> project2ChipsRoomsCollection) {
        this.project2ChipsRoomsCollection = project2ChipsRoomsCollection;
    }

    public Project2Collections getCollectionsId() {
        return collectionsId;
    }

    public void setCollectionsId(Project2Collections collectionsId) {
        this.collectionsId = collectionsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (speciesId != null ? speciesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Species)) {
            return false;
        }
        Project2Species other = (Project2Species) object;
        if ((this.speciesId == null && other.speciesId != null) || (this.speciesId != null && !this.speciesId.equals(other.speciesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Species[ speciesId=" + speciesId + " ]";
    }
    
}
