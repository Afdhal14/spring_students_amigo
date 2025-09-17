package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollegeRepository extends JpaRepository<College,Integer> {

    List<College> findByCollegeType(String collegeType);

    List<College> findByCollegeGroup(String collegeGroup);
}
