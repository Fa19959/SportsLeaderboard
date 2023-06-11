package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.LeaderBoard;
import com.example.SportLeaderboard.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "LeaderBoard")
public class LeaderBoardController {
    @Autowired
    LeaderBoardService leaderBoardService;

    @RequestMapping(value = "createLeaderBoard", method = RequestMethod.POST)
    public void createLeaderBoard() {
        leaderBoardService.createLeaderBoard();
    }

    @RequestMapping(value = "getLeaderBoardById", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }
}