package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.LeaderBoard;
import com.example.SportLeaderboard.RequestObject.LeaderBoardRequest;
import com.example.SportLeaderboard.Service.LeaderBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "LeaderBoard")
public class LeaderBoardController {
    @Autowired
    LeaderBoardService leaderBoardService;

    @RequestMapping(value = "createLeaderBoard", method = RequestMethod.POST)
    public void createLeaderBoard(@RequestParam LeaderBoardRequest leaderBoardRequest) {
        leaderBoardService.createLeaderBoard(leaderBoardRequest);
    }
    @RequestMapping(value = "retrieveCurrentStandings", method = RequestMethod.POST)
    public List<LeaderBoard> getLeaderBoardOrderByWins() {
        return leaderBoardService.getLeaderBoardOrderByWins();
    }

    @RequestMapping(value = "getLeaderBoardById", method = RequestMethod.GET)
    public LeaderBoard getLeaderBoardById(@RequestParam Integer id) {
        LeaderBoard leaderBoardById = leaderBoardService.getLeaderBoardById(id);
        return leaderBoardById;
    }
}