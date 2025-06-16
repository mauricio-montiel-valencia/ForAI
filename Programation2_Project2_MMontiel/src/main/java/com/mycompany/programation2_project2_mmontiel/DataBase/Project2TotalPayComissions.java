/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programation2_project2_mmontiel.DataBase;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Mauricio10
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "PROJECT2_TOTAL_PAY_COMISSIONS")
@javax.persistence.NamedQueries({
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findAll", query = "SELECT p FROM Project2TotalPayComissions p"),
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findByTotalPayComissionId", query = "SELECT p FROM Project2TotalPayComissions p WHERE p.totalPayComissionId = :totalPayComissionId"),
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findByTotalPayCommissionDate", query = "SELECT p FROM Project2TotalPayComissions p WHERE p.totalPayCommissionDate = :totalPayCommissionDate"),
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findByTotalPayComissionKeybrands", query = "SELECT p FROM Project2TotalPayComissions p WHERE p.totalPayComissionKeybrands = :totalPayComissionKeybrands"),
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findByTotalPayComissionPerbrand", query = "SELECT p FROM Project2TotalPayComissions p WHERE p.totalPayComissionPerbrand = :totalPayComissionPerbrand"),
    @javax.persistence.NamedQuery(name = "Project2TotalPayComissions.findByTotalPayComissionPdf", query = "SELECT p FROM Project2TotalPayComissions p WHERE p.totalPayComissionPdf = :totalPayComissionPdf")})
public class Project2TotalPayComissions implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @javax.persistence.Id
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "TOTAL_PAY_COMISSION_ID")
    private BigDecimal totalPayComissionId;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "TOTAL_PAY_COMMISSION_DATE")
    @javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date totalPayCommissionDate;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "TOTAL_PAY_COMISSION_KEYBRANDS")
    private String totalPayComissionKeybrands;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "TOTAL_PAY_COMISSION_PERBRAND")
    private BigInteger totalPayComissionPerbrand;
    @javax.persistence.Basic(optional = false)
    @javax.persistence.Column(name = "TOTAL_PAY_COMISSION_PDF")
    private String totalPayComissionPdf;
    @javax.persistence.JoinColumn(name = "COMISSION_KEY_ID", referencedColumnName = "COMISSION_KEY_ID")
    @javax.persistence.ManyToOne(optional = false, fetch = javax.persistence.FetchType.EAGER)
    private Project2ComissionsKey comissionKeyId;

    public Project2TotalPayComissions() {
    }

    public Project2TotalPayComissions(BigDecimal totalPayComissionId) {
        this.totalPayComissionId = totalPayComissionId;
    }

    public Project2TotalPayComissions(BigDecimal totalPayComissionId, Date totalPayCommissionDate, String totalPayComissionKeybrands, BigInteger totalPayComissionPerbrand, String totalPayComissionPdf) {
        this.totalPayComissionId = totalPayComissionId;
        this.totalPayCommissionDate = totalPayCommissionDate;
        this.totalPayComissionKeybrands = totalPayComissionKeybrands;
        this.totalPayComissionPerbrand = totalPayComissionPerbrand;
        this.totalPayComissionPdf = totalPayComissionPdf;
    }

    public BigDecimal getTotalPayComissionId() {
        return totalPayComissionId;
    }

    public void setTotalPayComissionId(BigDecimal totalPayComissionId) {
        this.totalPayComissionId = totalPayComissionId;
    }

    public Date getTotalPayCommissionDate() {
        return totalPayCommissionDate;
    }

    public void setTotalPayCommissionDate(Date totalPayCommissionDate) {
        this.totalPayCommissionDate = totalPayCommissionDate;
    }

    public String getTotalPayComissionKeybrands() {
        return totalPayComissionKeybrands;
    }

    public void setTotalPayComissionKeybrands(String totalPayComissionKeybrands) {
        this.totalPayComissionKeybrands = totalPayComissionKeybrands;
    }

    public BigInteger getTotalPayComissionPerbrand() {
        return totalPayComissionPerbrand;
    }

    public void setTotalPayComissionPerbrand(BigInteger totalPayComissionPerbrand) {
        this.totalPayComissionPerbrand = totalPayComissionPerbrand;
    }

    public String getTotalPayComissionPdf() {
        return totalPayComissionPdf;
    }

    public void setTotalPayComissionPdf(String totalPayComissionPdf) {
        this.totalPayComissionPdf = totalPayComissionPdf;
    }

    public Project2ComissionsKey getComissionKeyId() {
        return comissionKeyId;
    }

    public void setComissionKeyId(Project2ComissionsKey comissionKeyId) {
        this.comissionKeyId = comissionKeyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (totalPayComissionId != null ? totalPayComissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project2TotalPayComissions)) {
            return false;
        }
        Project2TotalPayComissions other = (Project2TotalPayComissions) object;
        if ((this.totalPayComissionId == null && other.totalPayComissionId != null) || (this.totalPayComissionId != null && !this.totalPayComissionId.equals(other.totalPayComissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.programation2_project2_mmontiel.DataBase.Project2TotalPayComissions[ totalPayComissionId=" + totalPayComissionId + " ]";
    }
    
}
