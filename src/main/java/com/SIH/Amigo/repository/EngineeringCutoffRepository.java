package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.EngineeringCutoff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EngineeringCutoffRepository extends JpaRepository<EngineeringCutoff,Integer> {

    List<EngineeringCutoff> findByCollegeId(int collegeId);

    @Query("SELECT e.course FROM EngineeringCutoff e WHERE e.collegeId = :collegeId")
    List<String> findCourseNamesByCollegeId(@Param("collegeId") int collegeId);
}
