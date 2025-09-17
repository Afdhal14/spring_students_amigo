package com.SIH.Amigo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "engineeringcutoff")
public class EngineeringCutoff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private int collegeId;
    private String course;
    private float OC;
    private float BC;
    private float BCM;
    private float MBC;

    public EngineeringCutoff() {
    }

    public EngineeringCutoff(int collegeId, String course, float OC, float BC, float BCM, float MBC) {
        this.collegeId = collegeId;
        this.course = course;
        this.OC = OC;
        this.BC = BC;
        this.BCM = BCM;
        this.MBC = MBC;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getOC() {
        return OC;
    }

    public void setOC(float OC) {
        this.OC = OC;
    }

    public float getBC() {
        return BC;
    }

    public void setBC(float BC) {
        this.BC = BC;
    }

    public float getBCM() {
        return BCM;
    }

    public void setBCM(float BCM) {
        this.BCM = BCM;
    }

    public float getMBC() {
        return MBC;
    }

    public void setMBC(float MBC) {
        this.MBC = MBC;
    }
}
