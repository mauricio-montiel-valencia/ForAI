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
@javax.persistence.Table(name = "PROJECT2_THEMES")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2Themes.findAll", query = "SELECT p FROM Project2Themes p"),
    @javax.persistence.NamedQuery(name = "Project2Themes.findByThemesId", query = "SELECT p FROM Project2Themes p WHERE p.themesId = :themesId"),
    @javax.persistence.NamedQuery(name = "Project2Themes.findByThemesName", query = "SELECT p FROM Project2Themes p WHERE p.themesName = :themesName"),
    @javax.persistence.NamedQuery(name = "Project2Themes.findByThemesCharacteristics", query = "SELECT p FROM Project2Themes p WHERE p.themesCharacteristics = :themesCharacteristics"),
    @javax.persistence.NamedQuery(name = "Project2Themes.findByThemesEra", query = "SELECT p FROM Project2Themes p WHERE p.themesEra = :themesEra"),
    @javax.persistence.NamedQuery(name = "Project2Themes.findByThemesImage", query = "SELECT p FROM Project2Themes p WHERE p.themesImage = :themesImage")})
public class Project2Themes implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "THEMES_ID")
    private BigDecimal themesId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "THEMES_NAME")
    private String themesName;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "THEMES_CHARACTERISTICS")
    private String themesCharacteristics;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "THEMES_ERA")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date themesEra;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "THEMES_IMAGE")
    private String themesImage;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "themesId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2ChipsRooms> project2ChipsRoomsCollection;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;

    public Project2Themes() {
    }

    public Project2Themes(BigDecimal themesId) {
        this.themesId = themesId;
    }

    public Project2Themes(BigDecimal themesId, String themesName, String themesCharacteristics, Date themesEra, String themesImage) {
        this.themesId = themesId;
        this.themesName = themesName;
        this.themesCharacteristics = themesCharacteristics;
        this.themesEra = themesEra;
        this.themesImage = themesImage;
    }

    public BigDecimal getThemesId() {
        return themesId;
    }

    public void setThemesId(BigDecimal themesId) {
        this.themesId = themesId;
    }

    public String getThemesName() {
        return themesName;
    }

    public void setThemesName(String themesName) {
        this.themesName = themesName;
    }

    public String getThemesCharacteristics() {
        return themesCharacteristics;
    }

    public void setThemesCharacteristics(String themesCharacteristics) {
        this.themesCharacteristics = themesCharacteristics;
    }

    public Date getThemesEra() {
        return themesEra;
    }

    public void setThemesEra(Date themesEra) {
        this.themesEra = themesEra;
    }

    public String getThemesImage() {
        return themesImage;
    }

    public void setThemesImage(String themesImage) {
        this.themesImage = themesImage;
    }

    public Collection<Project2ChipsRooms> getProject2ChipsRoomsCollection() {
        return project2ChipsRoomsCollection;
    }

    public void setProject2ChipsRoomsCollection(Collection<Project2ChipsRooms> project2ChipsRoomsCollection) {
        this.project2ChipsRoomsCollection = project2ChipsRoomsCollection;
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
        hash += (themesId != null ? themesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2Themes)) {
            return false;
        }
        Project2Themes other = (Project2Themes) object;
        if ((this.themesId == null && other.themesId != null) || (this.themesId != null && !this.themesId.equals(other.themesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2Themes[ themesId=" + themesId + " ]";
    }
    
}
