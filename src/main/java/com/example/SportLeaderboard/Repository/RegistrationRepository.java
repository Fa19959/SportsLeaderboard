package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
    @Query(value = "SELECT r FROM Registration r where r.id= :id")
    Registration getRegistrationId(@Param("id") Integer id);
}
