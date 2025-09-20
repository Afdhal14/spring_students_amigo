package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.MentorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorDataRepository extends JpaRepository<MentorData,String> {
    String findEmailIdByUsername(String userName);
}
