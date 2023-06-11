package com.example.SportLeaderboard.Repository;

import com.example.SportLeaderboard.Models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
//    @Query(value = "SELECT s.id FROM Player s WHERE s.userName= :userName")
//        //get player by name
//    Integer getPlayerByName(@Param("userName") String userName);
//    @Query(value = "SELECT s FROM Player s WHERE s.password= :password")
//    Player getPlayerID(@Param("password") String password);
    @Query(value = "SELECT s FROM Player s")
    List<Player> getAllPlayer();

    @Query(value = "SELECT m FROM Player m where m.id= :id")
    Player getPlayerId(@Param("id") Integer id);


}