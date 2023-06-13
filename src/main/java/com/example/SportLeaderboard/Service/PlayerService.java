package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Player;
import com.example.SportLeaderboard.Repository.PlayerRepository;
import com.example.SportLeaderboard.Repository.TeamRepository;
import com.example.SportLeaderboard.RequestObject.PlayerRequest;
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

    public void RegisterPlayer(PlayerRequest playerRequest) {
        Player player = new Player();
        player.setTeamName(playerRequest.getTeamName());
        player.setName(playerRequest.getPlayerName());
        player.setSport(playerRequest.getSport());
        player.setCreateDate(new Date());
        player.setUpdateDate(new Date());
        player.setIsActive(Boolean.TRUE);
        playerRepository.save(player);
    }

//    public void updatePlayer(PlayerRequest playerRequest) {
//
//        Player player = new Player();
//        player.setPlayerId(playerRequest.getPlayerId());
//        player.setTeamName(playerRequest.getTeamName());
//        player.setSport(playerRequest.getSport());
//        player.setCreateDate(new Date());
//        player.setUpdateDate(new Date());
//        player.setIsActive(Boolean.TRUE);
//        playerRepository.save(player);
//
//    }

    public Player getPlayerById(Integer id) {
        Player player = playerRepository.getPlayerId(id);
        return player;

    }

    public List<Player> getAllPlayers() {
        return playerRepository.getAllPlayer();
    }

//    public void registerPlayers(PlayerRequest playerRequest) {
//        Player player = playerRequest.covertPlayerToRequest(playerRequest);
//        playerRepository.save(player);
//    }

}