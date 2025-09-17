package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.EngineeringCutoff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineeringCutoffRepository extends JpaRepository<EngineeringCutoff,Integer> {
}
