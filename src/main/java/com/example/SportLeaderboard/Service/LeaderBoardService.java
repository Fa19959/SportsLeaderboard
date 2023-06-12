package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.LeaderBoard;
import com.example.SportLeaderboard.Repository.LeaderBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class LeaderBoardService {
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    public void createLeaderBoard() {
        LeaderBoard leaderBoard = new LeaderBoard();
        leaderBoard.setTeamName("RDF");
        leaderBoard.setTeamWins(1);
        leaderBoard.setTeamLosses(0);
        leaderBoard.setCreateDate(new Date());
        leaderBoard.setIsActive(true);
        leaderBoardRepository.save(leaderBoard);
    }

    public LeaderBoard getLeaderBoardById(Integer id) {
        LeaderBoard leaderBoardById = leaderBoardRepository.getLeaderBoardById(id);
        return leaderBoardById;
    }


}