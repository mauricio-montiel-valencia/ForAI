/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_ROOM_VALORATION")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2RoomValoration.findAll", query = "SELECT p FROM Project2RoomValoration p"),
    @javax.persistence.NamedQuery(name = "Project2RoomValoration.findByRoomValorationId", query = "SELECT p FROM Project2RoomValoration p WHERE p.roomValorationId = :roomValorationId"),
    @javax.persistence.NamedQuery(name = "Project2RoomValoration.findByRoomValorationBest", query = "SELECT p FROM Project2RoomValoration p WHERE p.roomValorationBest = :roomValorationBest"),
    @javax.persistence.NamedQuery(name = "Project2RoomValoration.findByRoomValorationWorst", query = "SELECT p FROM Project2RoomValoration p WHERE p.roomValorationWorst = :roomValorationWorst")})
public class Project2RoomValoration implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOM_VALORATION_ID")
    private BigDecimal roomValorationId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOM_VALORATION_BEST")
    private String roomValorationBest;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "ROOM_VALORATION_WORST")
    private String roomValorationWorst;
    @javax.persistence.JoinColumn(name = "CHIPS_ROOMS_ID", referencedColumnName = "CHIPS_ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2ChipsRooms chipsRoomsId;

    public Project2RoomValoration() {
    }

    public Project2RoomValoration(BigDecimal roomValorationId) {
        this.roomValorationId = roomValorationId;
    }

    public Project2RoomValoration(BigDecimal roomValorationId, String roomValorationBest, String roomValorationWorst) {
        this.roomValorationId = roomValorationId;
        this.roomValorationBest = roomValorationBest;
        this.roomValorationWorst = roomValorationWorst;
    }

    public BigDecimal getRoomValorationId() {
        return roomValorationId;
    }

    public void setRoomValorationId(BigDecimal roomValorationId) {
        this.roomValorationId = roomValorationId;
    }

    public String getRoomValorationBest() {
        return roomValorationBest;
    }

    public void setRoomValorationBest(String roomValorationBest) {
        this.roomValorationBest = roomValorationBest;
    }

    public String getRoomValorationWorst() {
        return roomValorationWorst;
    }

    public void setRoomValorationWorst(String roomValorationWorst) {
        this.roomValorationWorst = roomValorationWorst;
    }

    public Project2ChipsRooms getChipsRoomsId() {
        return chipsRoomsId;
    }

    public void setChipsRoomsId(Project2ChipsRooms chipsRoomsId) {
        this.chipsRoomsId = chipsRoomsId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomValorationId != null ? roomValorationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2RoomValoration)) {
            return false;
        }
        Project2RoomValoration other = (Project2RoomValoration) object;
        if ((this.roomValorationId == null && other.roomValorationId != null) || (this.roomValorationId != null && !this.roomValorationId.equals(other.roomValorationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2RoomValoration[ roomValorationId=" + roomValorationId + " ]";
    }
    
}
