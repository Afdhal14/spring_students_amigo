package com.SIH.Amigo.service;

import com.SIH.Amigo.model.College;
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
}
