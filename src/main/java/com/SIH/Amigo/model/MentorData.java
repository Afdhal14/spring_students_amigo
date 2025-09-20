package com.SIH.Amigo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class MentorData {
    @Id
    private String username;
    private String name;
    @ElementCollection
    @CollectionTable(
            name = "mentorSpecialization",
            joinColumns = @JoinColumn(name = "username")
    )
    @Column(name = "specialization")
    private List<String> specialization;
    private String gender;
    private String organization;
    private String phoneNo;
    private LocalDate dateOfBirth;
    private String mailId;
    @Lob
    private byte[] profilePhoto;

    public MentorData(String username, String name, List<String> specialization, String gender, String organization, String phoneNo, LocalDate dateOfBirth, String mailId,byte[] profilePhoto) {
        this.username = username;
        this.name = name;
        this.specialization = specialization;
        this.gender = gender;
        this.organization = organization;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        this.mailId = mailId;
        this.profilePhoto = profilePhoto;
    }

    public MentorData() {
    }

    public byte[] getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(byte[] profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSpecialization() {
        return specialization;
    }

    public void setSpecialization(List<String> specialization) {
        this.specialization = specialization;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }
}
