package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query(value = "select t from Team t where t.id=:teamId")
    public Team getTeamById(@Param("teamId") Integer id);
}
