package com.SIH.Amigo.controller;

import com.SIH.Amigo.model.College;
import com.SIH.Amigo.model.EngineeringCutoff;
import com.SIH.Amigo.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/getCoursesWithCutOff/{collegeId}")
    public List<EngineeringCutoff> getCoursesWithCutOff(@PathVariable int collegeId)
    {
        return collegeService.getCoursesWithCutOff(collegeId);
    }

    @GetMapping("/getCourses/{collegeId}")
    public List<String> getCourses(@PathVariable int collegeId)
    {
        return collegeService.getCourses(collegeId);
    }

    @GetMapping("/getCollegesByType/{collegeType}")
    public List<College> getCollegesByType(@PathVariable String collegeType)
    {
        return collegeService.getCollegesByType(collegeType);
    }

    @GetMapping("/getCollegesByGroup/{collegeGroup}")
    public List<College> getCollegesByGroup(@PathVariable String collegeGroup)
    {
        return collegeService.getCollegesByGroup(collegeGroup);
    }

    @PostMapping("/addCollege")
    public String addCollege(@RequestBody College college)
    {
        return collegeService.addCollege(college);
    }


}
