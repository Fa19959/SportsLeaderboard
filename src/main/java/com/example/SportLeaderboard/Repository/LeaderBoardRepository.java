package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.LeaderBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<LeaderBoard, Integer> {
    @Query(value = "SELECT l FROM LeaderBoard l where l.id= :id")
    LeaderBoard getLeaderBoardById(@Param("id") Integer id);

    @Query(value = "SELECT l FROM LeaderBoard l order by l.teamWins desc")
    List<LeaderBoard> getLeaderBoardOrderByWins();


}
