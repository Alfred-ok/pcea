package com.example.pcea.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "visitors")
public class Visitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "national_id", nullable = false, unique = true)
    private String nationalId;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    @Column(name = "created_at", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    // Default constructor required by JPA
    public Visitor() {
    }

    // Parameterized constructor for easy object creation
    public Visitor(String firstName, String middleName, String surname, String nationalId, String mobile) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.nationalId = nationalId;
        this.mobile = mobile;
    }

    // PrePersist to set creation timestamp
    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

