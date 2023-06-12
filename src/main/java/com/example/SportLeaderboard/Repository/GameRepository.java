package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    @Query(value = "SELECT g FROM Game g where g.id= :id")
    Game getGameById(@Param("id") Integer id);

    @Query("SELECT G FROM Game g")
    List<Game> getAllGames();


    @Query(value = "SELECT * FROM Game where created_Date Like concat (?1,%)", nativeQuery = true)
    List<Game> getAllGamesByCreatedDate(@Param("createdDate") String createdDate);
//(?1,%) Filter the created_Date column,?1 represents the first parameter in the method (createdDate),and % matches any number of characters.

    @Query("SELECT g FROM Game g where g.isActive = 1")
    List<Game> getAllActiveGames();
}
