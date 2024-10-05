package com.example.pcea.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Member", schema = "dbo")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ZPNumber")
    private String zpNumber;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "DOB")
    private LocalDateTime dob;

    @Column(name = "District")
    private String district;

    @Column(name = "MaritalStatus")
    private String maritalStatus;

    @Column(name = "SpouseZPNumber")
    private String spouseZPNumber;

    @Column(name = "SpouseName")
    private String spouseName;

    @Column(name = "NationalID")
    private String nationalID;

    @Column(name = "MobileNumber")
    private String mobileNumber;

    @Column(name = "CardSerialNumber")
    private String cardSerialNumber;

    @Column(name = "HolyCommunionStatus")
    private String holyCommunionStatus;

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;

    @Column(name = "UpdatedBy")
    private String updatedBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZpNumber() {
        return zpNumber;
    }

    public void setZpNumber(String zpNumber) {
        this.zpNumber = zpNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSpouseZPNumber() {
        return spouseZPNumber;
    }

    public void setSpouseZPNumber(String spouseZPNumber) {
        this.spouseZPNumber = spouseZPNumber;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCardSerialNumber() {
        return cardSerialNumber;
    }

    public void setCardSerialNumber(String cardSerialNumber) {
        this.cardSerialNumber = cardSerialNumber;
    }

    public String getHolyCommunionStatus() {
        return holyCommunionStatus;
    }

    public void setHolyCommunionStatus(String holyCommunionStatus) {
        this.holyCommunionStatus = holyCommunionStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
