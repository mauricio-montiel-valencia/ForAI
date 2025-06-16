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
@javax.persistence.Table(name = "PROJECT2_CHIPS_ROOMS")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findAll", query = "SELECT p FROM Project2ChipsRooms p"),
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findByChipsRoomsId", query = "SELECT p FROM Project2ChipsRooms p WHERE p.chipsRoomsId = :chipsRoomsId"),
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findByChipsRoomsChips", query = "SELECT p FROM Project2ChipsRooms p WHERE p.chipsRoomsChips = :chipsRoomsChips"),
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findByChipsRoomsCalification", query = "SELECT p FROM Project2ChipsRooms p WHERE p.chipsRoomsCalification = :chipsRoomsCalification"),
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findByChipsRoomsObservation", query = "SELECT p FROM Project2ChipsRooms p WHERE p.chipsRoomsObservation = :chipsRoomsObservation"),
    @javax.persistence.NamedQuery(name = "Project2ChipsRooms.findByChipsRoomsValoratiopromedy", query = "SELECT p FROM Project2ChipsRooms p WHERE p.chipsRoomsValoratiopromedy = :chipsRoomsValoratiopromedy")})
public class Project2ChipsRooms implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "CHIPS_ROOMS_ID")
    private BigDecimal chipsRoomsId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "CHIPS_ROOMS_CHIPS")
    private String chipsRoomsChips;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "CHIPS_ROOMS_CALIFICATION")
    private BigInteger chipsRoomsCalification;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "CHIPS_ROOMS_OBSERVATION")
    private String chipsRoomsObservation;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "CHIPS_ROOMS_VALORATIOPROMEDY")
    private BigInteger chipsRoomsValoratiopromedy;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;
    @javax.persistence.JoinColumn(name = "SPECIES_ID", referencedColumnName = "SPECIES_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Species speciesId;
    @javax.persistence.JoinColumn(name = "THEMES_ID", referencedColumnName = "THEMES_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Themes themesId;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "chipsRoomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2RoomValoration> project2RoomValorationCollection;

    public Project2ChipsRooms() {
    }

    public Project2ChipsRooms(BigDecimal chipsRoomsId) {
        this.chipsRoomsId = chipsRoomsId;
    }

    public Project2ChipsRooms(BigDecimal chipsRoomsId, String chipsRoomsChips, BigInteger chipsRoomsCalification, String chipsRoomsObservation, BigInteger chipsRoomsValoratiopromedy) {
        this.chipsRoomsId = chipsRoomsId;
        this.chipsRoomsChips = chipsRoomsChips;
        this.chipsRoomsCalification = chipsRoomsCalification;
        this.chipsRoomsObservation = chipsRoomsObservation;
        this.chipsRoomsValoratiopromedy = chipsRoomsValoratiopromedy;
    }

    public BigDecimal getChipsRoomsId() {
        return chipsRoomsId;
    }

    public void setChipsRoomsId(BigDecimal chipsRoomsId) {
        this.chipsRoomsId = chipsRoomsId;
    }

    public String getChipsRoomsChips() {
        return chipsRoomsChips;
    }

    public void setChipsRoomsChips(String chipsRoomsChips) {
        this.chipsRoomsChips = chipsRoomsChips;
    }

    public BigInteger getChipsRoomsCalification() {
        return chipsRoomsCalification;
    }

    public void setChipsRoomsCalification(BigInteger chipsRoomsCalification) {
        this.chipsRoomsCalification = chipsRoomsCalification;
    }

    public String getChipsRoomsObservation() {
        return chipsRoomsObservation;
    }

    public void setChipsRoomsObservation(String chipsRoomsObservation) {
        this.chipsRoomsObservation = chipsRoomsObservation;
    }

    public BigInteger getChipsRoomsValoratiopromedy() {
        return chipsRoomsValoratiopromedy;
    }

    public void setChipsRoomsValoratiopromedy(BigInteger chipsRoomsValoratiopromedy) {
        this.chipsRoomsValoratiopromedy = chipsRoomsValoratiopromedy;
    }

    public Project2Rooms getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(Project2Rooms roomsId) {
        this.roomsId = roomsId;
    }

    public Project2Species getSpeciesId() {
        return speciesId;
    }

    public void setSpeciesId(Project2Species speciesId) {
        this.speciesId = speciesId;
    }

    public Project2Themes getThemesId() {
        return themesId;
    }

    public void setThemesId(Project2Themes themesId) {
        this.themesId = themesId;
    }

    public Collection<Project2RoomValoration> getProject2RoomValorationCollection() {
        return project2RoomValorationCollection;
    }

    public void setProject2RoomValorationCollection(Collection<Project2RoomValoration> project2RoomValorationCollection) {
        this.project2RoomValorationCollection = project2RoomValorationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chipsRoomsId != null ? chipsRoomsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2ChipsRooms)) {
            return false;
        }
        Project2ChipsRooms other = (Project2ChipsRooms) object;
        if ((this.chipsRoomsId == null && other.chipsRoomsId != null) || (this.chipsRoomsId != null && !this.chipsRoomsId.equals(other.chipsRoomsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2ChipsRooms[ chipsRoomsId=" + chipsRoomsId + " ]";
    }
    
}
