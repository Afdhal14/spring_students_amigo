package com.SIH.Amigo.controller;

import com.SIH.Amigo.model.College;
import com.SIH.Amigo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @GetMapping("/getAllColleges")
    public List<College> getColleges ()
    {
        return collegeService.getColleges();
    }
}
