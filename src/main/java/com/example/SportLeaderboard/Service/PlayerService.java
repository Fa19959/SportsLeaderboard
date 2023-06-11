package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Player;
import com.example.SportLeaderboard.Repository.PlayerRepository;
import com.example.SportLeaderboard.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    TeamRepository teamRepository;

    public void RegisterPlayer() {
        Player player = new Player();
        player.setTeamName("OTO");
        player.setPlayerName("fatma");
        player.setSport("Basketball");
        player.setCreateDate(new Date());
        player.setUpdateDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);


    }

//    public Integer getPlayerByNames(String username) {
//        return playerRepository.getPlayerByName(username);
//
//    }
    public List<Player> getAllPlayers(){                              //get all player

        return playerRepository.getAllPlayer();
    }

//    public void deleteTeamById(String password){                     // Delete by id
//        Player player=playerRepository.getPlayerID(password);
//        player.setIsActive(false);
//        playerRepository.save(player);
//
//    }
    public void updatePlayer (){                //Update Player

        Player player=new Player();
        player.setPlayerId(1);
        player.setTeamName("All for one");
        player.setSport("football");
        player.setCreateDate(new Date());
        player.setUpdateDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);

    }
    public Player getPlayerById(Integer id){                         //get player by id
        Player player=playerRepository.getPlayerId(id);
        return player;

    }

}