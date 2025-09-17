package com.SIH.Amigo.service;

import com.SIH.Amigo.model.College;
import com.SIH.Amigo.model.EngineeringCutoff;
import com.SIH.Amigo.repository.CollegeRepository;
import com.SIH.Amigo.repository.EngineeringCutoffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Autowired
    private EngineeringCutoffRepository engineeringCutoffRepository;

    public List<College> getColleges() {
        return collegeRepository.findAll();
    }

    public List<EngineeringCutoff> getCoursesWithCutOff(int collegeId) {
        return engineeringCutoffRepository.findByCollegeId(collegeId);
    }

    public List<String> getCourses(int collegeId) {
        return engineeringCutoffRepository.findCourseNamesByCollegeId(collegeId);
    }

    public List<College> getCollegesByType(String collegeType) {
        return collegeRepository.findByCollegeType(collegeType);
    }

    public List<College> getCollegesByGroup(String collegeGroup) {
        return collegeRepository.findByCollegeGroup(collegeGroup);
    }

    public String addCollege(College college) {
        collegeRepository.save(college);
        return "Successful";
    }
}
