/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_ROOMS")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Rooms.findAll", query = "SELECT p FROM Project2Rooms p"),
    @javax.persistence.NamedQuery(name = "Project2Rooms.findByRoomsId", query = "SELECT p FROM Project2Rooms p WHERE p.roomsId = :roomsId"),
    @javax.persistence.NamedQuery(name = "Project2Rooms.findByRoomsName", query = "SELECT p FROM Project2Rooms p WHERE p.roomsName = :roomsName"),
    @javax.persistence.NamedQuery(name = "Project2Rooms.findByRoomsDescription", query = "SELECT p FROM Project2Rooms p WHERE p.roomsDescription = :roomsDescription")})
public class Project2Rooms implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOMS_ID")
    private BigDecimal roomsId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOMS_NAME")
    private String roomsName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOMS_DESCRIPTION")
    private String roomsDescription;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2ChipsRooms> project2ChipsRoomsCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2AutoriceEntrance> project2AutoriceEntranceCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Collections> project2CollectionsCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2ComissionsKey> project2ComissionsKeyCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Prices> project2PricesCollection;
    @javax.persistence.JoinColumn(name = "MUSEUM_ID", referencedColumnName = "MUSEUM_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Museum museumId;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Entrance> project2EntranceCollection;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "roomsId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2Themes> project2ThemesCollection;

    public Project2Rooms() {
    }

    public Project2Rooms(BigDecimal roomsId) {
        this.roomsId = roomsId;
    }

    public Project2Rooms(BigDecimal roomsId, String roomsName, String roomsDescription) {
        this.roomsId = roomsId;
        this.roomsName = roomsName;
        this.roomsDescription = roomsDescription;
    }

    public BigDecimal getRoomsId() {
        return roomsId;
    }

    public void setRoomsId(BigDecimal roomsId) {
        this.roomsId = roomsId;
    }

    public String getRoomsName() {
        return roomsName;
    }

    public void setRoomsName(String roomsName) {
        this.roomsName = roomsName;
    }

    public String getRoomsDescription() {
        return roomsDescription;
    }

    public void setRoomsDescription(String roomsDescription) {
        this.roomsDescription = roomsDescription;
    }

    public Collection<Project2ChipsRooms> getProject2ChipsRoomsCollection() {
        return project2ChipsRoomsCollection;
    }

    public void setProject2ChipsRoomsCollection(Collection<Project2ChipsRooms> project2ChipsRoomsCollection) {
        this.project2ChipsRoomsCollection = project2ChipsRoomsCollection;
    }

    public Collection<Project2AutoriceEntrance> getProject2AutoriceEntranceCollection() {
        return project2AutoriceEntranceCollection;
    }

    public void setProject2AutoriceEntranceCollection(Collection<Project2AutoriceEntrance> project2AutoriceEntranceCollection) {
        this.project2AutoriceEntranceCollection = project2AutoriceEntranceCollection;
    }

    public Collection<Project2Collections> getProject2CollectionsCollection() {
        return project2CollectionsCollection;
    }

    public void setProject2CollectionsCollection(Collection<Project2Collections> project2CollectionsCollection) {
        this.project2CollectionsCollection = project2CollectionsCollection;
    }

    public Collection<Project2ComissionsKey> getProject2ComissionsKeyCollection() {
        return project2ComissionsKeyCollection;
    }

    public void setProject2ComissionsKeyCollection(Collection<Project2ComissionsKey> project2ComissionsKeyCollection) {
        this.project2ComissionsKeyCollection = project2ComissionsKeyCollection;
    }

    public Collection<Project2Prices> getProject2PricesCollection() {
        return project2PricesCollection;
    }

    public void setProject2PricesCollection(Collection<Project2Prices> project2PricesCollection) {
        this.project2PricesCollection = project2PricesCollection;
    }

    public Project2Museum getMuseumId() {
        return museumId;
    }

    public void setMuseumId(Project2Museum museumId) {
        this.museumId = museumId;
    }

    public Collection<Project2Entrance> getProject2EntranceCollection() {
        return project2EntranceCollection;
    }

    public void setProject2EntranceCollection(Collection<Project2Entrance> project2EntranceCollection) {
        this.project2EntranceCollection = project2EntranceCollection;
    }

    public Collection<Project2Themes> getProject2ThemesCollection() {
        return project2ThemesCollection;
    }

    public void setProject2ThemesCollection(Collection<Project2Themes> project2ThemesCollection) {
        this.project2ThemesCollection = project2ThemesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomsId != null ? roomsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Rooms)) {
            return false;
        }
        Project2Rooms other = (Project2Rooms) object;
        if ((this.roomsId == null && other.roomsId != null) || (this.roomsId != null && !this.roomsId.equals(other.roomsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Rooms[ roomsId=" + roomsId + " ]";
    }
    
}
