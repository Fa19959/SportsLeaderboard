package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game,Integer> {
    @Query(value = "SELECT g FROM Game g where g.id= :id")
    Game getGameById(@Param("id") Integer id);

}
