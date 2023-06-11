package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.RequestObject.GameRequest;
import com.example.SportLeaderboard.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Game")
public class GameController {
    @Autowired
    GameService gameService;

    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public void createGame() {
        gameService.createGame();
    }

    @RequestMapping(value = "createGame", method = RequestMethod.POST)
    public void createGameA(@RequestBody GameRequest gameRequest) {
        gameService.createGameA(gameRequest);
    }

    @RequestMapping(value = "getGameById", method = RequestMethod.GET)
    public Game getGameById(@RequestParam Integer id) {
        Game gameById = gameService.getGameById(id);
        return gameById;
    }
}