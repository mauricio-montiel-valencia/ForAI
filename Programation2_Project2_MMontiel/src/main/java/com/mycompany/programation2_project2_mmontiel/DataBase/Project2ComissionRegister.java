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
@javax.persistence.Table(name = "PROJECT2_COMISSION_REGISTER")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2ComissionRegister.findAll", query = "SELECT p FROM Project2ComissionRegister p"),
    @javax.persistence.NamedQuery(name = "Project2ComissionRegister.findByComissionRegisterId", query = "SELECT p FROM Project2ComissionRegister p WHERE p.comissionRegisterId = :comissionRegisterId")})
public class Project2ComissionRegister implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COMISSION_REGISTER_ID")
    private BigDecimal comissionRegisterId;
    @javax.persistence.JoinColumn(name = "ENTRANCE_ID", referencedColumnName = "ENTRANCE_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Entrance entranceId;

    public Project2ComissionRegister() {
    }

    public Project2ComissionRegister(BigDecimal comissionRegisterId) {
        this.comissionRegisterId = comissionRegisterId;
    }

    public BigDecimal getComissionRegisterId() {
        return comissionRegisterId;
    }

    public void setComissionRegisterId(BigDecimal comissionRegisterId) {
        this.comissionRegisterId = comissionRegisterId;
    }

    public Project2Entrance getEntranceId() {
        return entranceId;
    }

    public void setEntranceId(Project2Entrance entranceId) {
        this.entranceId = entranceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comissionRegisterId != null ? comissionRegisterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2ComissionRegister)) {
            return false;
        }
        Project2ComissionRegister other = (Project2ComissionRegister) object;
        if ((this.comissionRegisterId == null && other.comissionRegisterId != null) || (this.comissionRegisterId != null && !this.comissionRegisterId.equals(other.comissionRegisterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2ComissionRegister[ comissionRegisterId=" + comissionRegisterId + " ]";
    }
    
}
