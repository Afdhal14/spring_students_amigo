package com.SIH.Amigo.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class UsersData {
    @Id
    private String username;
    private String name;
    @ElementCollection
    @CollectionTable(
            name = "userInterests",
            joinColumns = @JoinColumn(name = "username")
    )
    @Column(name = "interest")
    private List<String> interests;
    private LocalDate dateOfBirth;
    private int markSSC;//10th
    private int markHSC;//12th
    private String schoolName;
    private String address;
    private String phoneNo;
    private String Gender;
    private String mailId;
    @Lob
    private byte[] profilePhoto;

    public UsersData(String username, String name, List<String> interests, LocalDate dateOfBirth, int markSSC, int markHSC, String schoolName, String address, String phoneNo, String gender, String mailId, byte[] profilePhoto) {
        this.username = username;
        this.name = name;
        this.interests = interests;
        this.dateOfBirth = dateOfBirth;
        this.markSSC = markSSC;
        this.markHSC = markHSC;
        this.schoolName = schoolName;
        this.address = address;
        this.phoneNo = phoneNo;
        Gender = gender;
        this.mailId = mailId;
        this.profilePhoto = profilePhoto;
    }

    public UsersData() {
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

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMarkSSC() {
        return markSSC;
    }

    public void setMarkSSC(int markSSC) {
        this.markSSC = markSSC;
    }

    public int getMarkHSC() {
        return markHSC;
    }

    public void setMarkHSC(int markHSC) {
        this.markHSC = markHSC;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public byte[] getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(byte[] profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
