package com.SIH.Amigo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int collegeId;
    private String collegeName;
    private String location;
    private String collegeGroup;
    private String establishment;
    private String collegeType;
    private String collegeDescription;
    private String collegeWebLink;
    private String collegePhoneNo;
    private String collegeMail;
    private String examType;
    @Lob
    private byte[] collegeImg;

    public College() {
    }

    public College(String collegeName, String location, String collegeGroup, String establishment, String collegeType, String collegeDescription, String collegeWebLink, String collegePhoneNo, String collegeMail, String examType, byte[] collegeImg) {
        this.collegeName = collegeName;
        this.location = location;
        this.collegeGroup = collegeGroup;
        this.establishment = establishment;
        this.collegeType = collegeType;
        this.collegeDescription = collegeDescription;
        this.collegeWebLink = collegeWebLink;
        this.collegePhoneNo = collegePhoneNo;
        this.collegeMail = collegeMail;
        this.examType = examType;
        this.collegeImg = collegeImg;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollegeGroup() {
        return collegeGroup;
    }

    public void setCollegeGroup(String collegeGroup) {
        this.collegeGroup = collegeGroup;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public String getCollegeType() {
        return collegeType;
    }

    public void setCollegeType(String collegeType) {
        this.collegeType = collegeType;
    }

    public String getCollegeDescription() {
        return collegeDescription;
    }

    public void setCollegeDescription(String collegeDescription) {
        this.collegeDescription = collegeDescription;
    }

    public String getCollegeWebLink() {
        return collegeWebLink;
    }

    public void setCollegeWebLink(String collegeWebLink) {
        this.collegeWebLink = collegeWebLink;
    }

    public String getCollegePhoneNo() {
        return collegePhoneNo;
    }

    public void setCollegePhoneNo(String collegePhoneNo) {
        this.collegePhoneNo = collegePhoneNo;
    }

    public String getCollegeMail() {
        return collegeMail;
    }

    public void setCollegeMail(String collegeMail) {
        this.collegeMail = collegeMail;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public byte[] getCollegeImg() {
        return collegeImg;
    }

    public void setCollegeImg(byte[] collegeImg) {
        this.collegeImg = collegeImg;
    }
}
