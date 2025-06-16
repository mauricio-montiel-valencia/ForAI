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
@javax.persistence.Table(name = "PROJECT2_COMISSIONS_KEY")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2ComissionsKey.findAll", query = "SELECT p FROM Project2ComissionsKey p"),
    @javax.persistence.NamedQuery(name = "Project2ComissionsKey.findByComissionKeyId", query = "SELECT p FROM Project2ComissionsKey p WHERE p.comissionKeyId = :comissionKeyId"),
    @javax.persistence.NamedQuery(name = "Project2ComissionsKey.findByComissionKeyKeytype", query = "SELECT p FROM Project2ComissionsKey p WHERE p.comissionKeyKeytype = :comissionKeyKeytype"),
    @javax.persistence.NamedQuery(name = "Project2ComissionsKey.findByComissionKeyCharged", query = "SELECT p FROM Project2ComissionsKey p WHERE p.comissionKeyCharged = :comissionKeyCharged"),
    @javax.persistence.NamedQuery(name = "Project2ComissionsKey.findByComissionKeyQr", query = "SELECT p FROM Project2ComissionsKey p WHERE p.comissionKeyQr = :comissionKeyQr")})
public class Project2ComissionsKey implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COMISSION_KEY_ID")
    private BigDecimal comissionKeyId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COMISSION_KEY_KEYTYPE")
    private String comissionKeyKeytype;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COMISSION_KEY_CHARGED")
    private BigInteger comissionKeyCharged;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "COMISSION_KEY_QR")
    private String comissionKeyQr;
    @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL, mappedBy = "comissionKeyId", fetch = javax.persistence.FetchType.EAGER)
    private Collection<Project2TotalPayComissions> project2TotalPayComissionsCollection;
    @javax.persistence.JoinColumn(name = "ROOMS_ID", referencedColumnName = "ROOMS_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2Rooms roomsId;

    public Project2ComissionsKey() {
    }

    public Project2ComissionsKey(BigDecimal comissionKeyId) {
        this.comissionKeyId = comissionKeyId;
    }

    public Project2ComissionsKey(BigDecimal comissionKeyId, String comissionKeyKeytype, BigInteger comissionKeyCharged, String comissionKeyQr) {
        this.comissionKeyId = comissionKeyId;
        this.comissionKeyKeytype = comissionKeyKeytype;
        this.comissionKeyCharged = comissionKeyCharged;
        this.comissionKeyQr = comissionKeyQr;
    }

    public BigDecimal getComissionKeyId() {
        return comissionKeyId;
    }

    public void setComissionKeyId(BigDecimal comissionKeyId) {
        this.comissionKeyId = comissionKeyId;
    }

    public String getComissionKeyKeytype() {
        return comissionKeyKeytype;
    }

    public void setComissionKeyKeytype(String comissionKeyKeytype) {
        this.comissionKeyKeytype = comissionKeyKeytype;
    }

    public BigInteger getComissionKeyCharged() {
        return comissionKeyCharged;
    }

    public void setComissionKeyCharged(BigInteger comissionKeyCharged) {
        this.comissionKeyCharged = comissionKeyCharged;
    }

    public String getComissionKeyQr() {
        return comissionKeyQr;
    }

    public void setComissionKeyQr(String comissionKeyQr) {
        this.comissionKeyQr = comissionKeyQr;
    }

    public Collection<Project2TotalPayComissions> getProject2TotalPayComissionsCollection() {
        return project2TotalPayComissionsCollection;
    }

    public void setProject2TotalPayComissionsCollection(Collection<Project2TotalPayComissions> project2TotalPayComissionsCollection) {
        this.project2TotalPayComissionsCollection = project2TotalPayComissionsCollection;
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
        hash += (comissionKeyId != null ? comissionKeyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2ComissionsKey)) {
            return false;
        }
        Project2ComissionsKey other = (Project2ComissionsKey) object;
        if ((this.comissionKeyId == null && other.comissionKeyId != null) || (this.comissionKeyId != null && !this.comissionKeyId.equals(other.comissionKeyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2ComissionsKey[ comissionKeyId=" + comissionKeyId + " ]";
    }
    
}
