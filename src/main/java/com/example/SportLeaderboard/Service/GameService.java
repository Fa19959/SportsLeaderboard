package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Repository.GameRepository;
import com.example.SportLeaderboard.Repository.TeamRepository;
import com.example.SportLeaderboard.RequestObject.GameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GameService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    GameRepository gameRepository;

//    public void createGame() {
//        Game gameToCreate = new Game();
//        gameToCreate.setDescription("This is game description");
//        gameToCreate.setScoreOfTeamOne(1);
//        gameToCreate.setScoreOfTeamTwo(2);
//        gameToCreate.setTeamOne(teamRepository.getTeamById(1));
//        gameToCreate.setTeamTwo(teamRepository.getTeamById(2));
//        gameToCreate.setCreateDate(new Date());
//        gameToCreate.setIsActive(true);
//        gameRepository.save(gameToCreate);
//
//
//    }

    // Create new Game
    public void createGameA(GameRequest gameRequest) {
        Game game = gameRequest.convertToGameRequest(gameRequest);
        gameRepository.save(game);
    }

    //Get game by id
    public Game getGameById(Integer id) {
        Game gameById = gameRepository.getGameById(id);
        return gameById;

    }

    public List<Game> getAllGames() {
        return gameRepository.getAllGames();
    }

    public List<Game> getAllGamesByCreatedDate(String createdDate) {
        return gameRepository.getAllGamesByCreatedDate(createdDate);
    }

    public List<Game> getAllActiveGames() {
        return gameRepository.getAllActiveGames();
    }

    public List<Game> getAllInActiveGames() {
        return gameRepository.getAllInActiveGames();
    }

    public void deleteAllGames() {
        gameRepository.deleteAllGame();
    }

    public void updateGame(GameRequest gameRequest) {
        Game game = gameRepository.getGameById(gameRequest.getGameId());
        game.setDescription(gameRequest.getGameDescription());
        game.setScoreOfTeamOne(gameRequest.getScoreTeam1());
        game.setScoreOfTeamTwo(gameRequest.getScoreTeam2());
        game.setUpdateDate(new Date());
        gameRepository.save(game);
    }
    //update the information about Game
//    public Game updateGame(Integer id, Game updateData) {
//        Game game = gameRepository.findById(id).orElse(null);
//        if (game!= null) {
//            game.setDescription(updateData.getDescription());
//            game.setScoreOfTeamOne(updateData.getScoreOfTeamOne());
//            return gameRepository.save(game);
//        }
//        return null;
//    }
}
