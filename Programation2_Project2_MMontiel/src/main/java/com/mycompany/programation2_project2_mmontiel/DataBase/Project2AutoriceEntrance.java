/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_AUTORICE_ENTRANCE")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2AutoriceEntrance.findAll", query = "SELECT p FROM Project2AutoriceEntrance p"),
    @javax.persistence.NamedQuery(name = "Project2AutoriceEntrance.findByAutoriceEntranceId", query = "SELECT p FROM Project2AutoriceEntrance p WHERE p.autoriceEntranceId = :autoriceEntranceId"),
    @javax.persistence.NamedQuery(name = "Project2AutoriceEntrance.findByAutoriceEntranceRoomticket", query = "SELECT p FROM Project2AutoriceEntrance p WHERE p.autoriceEntranceRoomticket = :autoriceEntranceRoomticket")})
public class Project2AutoriceEntrance implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "AUTORICE_ENTRANCE_ID")
    private BigDecimal autoriceEntranceId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "AUTORICE_ENTRANCE_ROOMTICKET")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date autoriceEntranceRoomticket;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;

    public Project2AutoriceEntrance() {
    }

    public Project2AutoriceEntrance(BigDecimal autoriceEntranceId) {
        this.autoriceEntranceId = autoriceEntranceId;
    }

    public Project2AutoriceEntrance(BigDecimal autoriceEntranceId, Date autoriceEntranceRoomticket) {
        this.autoriceEntranceId = autoriceEntranceId;
        this.autoriceEntranceRoomticket = autoriceEntranceRoomticket;
    }

    public BigDecimal getAutoriceEntranceId() {
        return autoriceEntranceId;
    }

    public void setAutoriceEntranceId(BigDecimal autoriceEntranceId) {
        this.autoriceEntranceId = autoriceEntranceId;
    }

    public Date getAutoriceEntranceRoomticket() {
        return autoriceEntranceRoomticket;
    }

    public void setAutoriceEntranceRoomticket(Date autoriceEntranceRoomticket) {
        this.autoriceEntranceRoomticket = autoriceEntranceRoomticket;
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
        hash += (autoriceEntranceId != null ? autoriceEntranceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2AutoriceEntrance)) {
            return false;
        }
        Project2AutoriceEntrance other = (Project2AutoriceEntrance) object;
        if ((this.autoriceEntranceId == null && other.autoriceEntranceId != null) || (this.autoriceEntranceId != null && !this.autoriceEntranceId.equals(other.autoriceEntranceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2AutoriceEntrance[ autoriceEntranceId=" + autoriceEntranceId + " ]";
    }
    
}
