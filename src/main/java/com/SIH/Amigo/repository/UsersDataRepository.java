package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.UsersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDataRepository extends JpaRepository<UsersData,String> {
    String findEmailIdByUsername(String userName);

    String findRoleByUsername(String userName);
}
