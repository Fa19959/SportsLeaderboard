package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.RequestObject.GameRequest;
import com.example.SportLeaderboard.ResponseObject.GameResponse;
import com.example.SportLeaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController  //Marks The Class As a controller.
@RequestMapping(value = "Game") //Map Incoming Requests to Specific Methods.
public class GameController {
    @Autowired
    GameService gameService;

//    @RequestMapping(value = "createGame", method = RequestMethod.POST)
//    public void createGame() {
//        gameService.createGame();
//    }

    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public void createGameA(@RequestBody GameRequest gameRequest) {
        gameService.createGameA(gameRequest);
    }

    @RequestMapping(value = "getGameById", method = RequestMethod.GET)
    public Game getGameById(@RequestParam Integer id) {
        Game gameById = gameService.getGameById(id);
        return gameById;
    }

    @RequestMapping(value = "getAllGames", method = RequestMethod.GET)
    public List<GameResponse> getAllGames() {
        List<Game> listOfGames = gameService.getAllGames();
        List<GameResponse> gameResponseList = GameResponse.convertRequestListToResponseList(listOfGames);
        return gameResponseList;
    }

    @RequestMapping(value = "getAllGamesByCreatedDate", method = RequestMethod.GET)
    public List<GameResponse> getAllGamesByCreatedDate(@RequestParam String createdDate) {
        List<Game> listOfGames = gameService.getAllGamesByCreatedDate(createdDate);
        List<GameResponse> gameResponseList = GameResponse.convertRequestListToResponseList(listOfGames);
        return gameResponseList;
    }

    @RequestMapping(value = "getAllActiveGames", method = RequestMethod.GET)
    public List<GameResponse> getAllActiveGames() {
        List<Game> listOfGames = gameService.getAllActiveGames();
        List<GameResponse> gameResponseList = GameResponse.convertRequestListToResponseList(listOfGames);
        return gameResponseList;
    }

    @RequestMapping(value = "getAllInActiveGames", method = RequestMethod.GET)
    public List<GameResponse> getAllInActiveGames() {
        List<Game> listOfGames = gameService.getAllInActiveGames();
        List<GameResponse> gameResponseList = GameResponse.convertRequestListToResponseList(listOfGames);
        return gameResponseList;
    }

    @RequestMapping(value = "deleteAllGame", method = RequestMethod.POST)
    public void deleteAllGame() {
        gameService.deleteAllGames();
    }

    @RequestMapping(value = "updateGame", method = RequestMethod.POST)
    public void updateGame(@RequestBody GameRequest gameRequest) {
        gameService.updateGame(gameRequest);
    }
}