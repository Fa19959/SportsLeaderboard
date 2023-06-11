package com.example.SportLeaderboard.Schedule;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Repository.GameRepository;
import com.example.SportLeaderboard.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Autowired
    GameRepository gameRepository;
    @Autowired
    PlayerRepository playerRepository;
    @Scheduled(cron = "0 0 0 * * *")
    public void getAllScoreByCreatedDate() {

        }
    }

