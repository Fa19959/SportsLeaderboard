package com.example.SportLeaderboard.Schedule;

import com.example.SportLeaderboard.Models.LeaderBoard;
import com.example.SportLeaderboard.Repository.LeaderBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Schedule {
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    @Scheduled(cron = "0 0 0 * * *")
    public List<LeaderBoard> getLeaderBoardOrderByWins(){
        List<LeaderBoard> leaderBoardOrderByWins = leaderBoardRepository.getLeaderBoardOrderByWins();
        return leaderBoardOrderByWins;
    }

}

