package com.SIH.Amigo.repository;

import com.SIH.Amigo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
