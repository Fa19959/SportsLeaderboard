package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Team;
import com.example.SportLeaderboard.Repository.RegistrationRepository;
import com.example.SportLeaderboard.Repository.TeamRepository;
import com.example.SportLeaderboard.RequestObject.TeamRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TeamService {
    @Autowired
    RegistrationRepository registrationRepository;
    @Autowired
    TeamRepository teamRepository;

    public void createTeam(TeamRequest teamRequest) {
        Team newTeam = new Team();
        newTeam.setLosses(teamRequest.getLosses());
        newTeam.setWins(teamRequest.getWins());
        newTeam.setCreateDate(new Date());
        newTeam.setIsActive(true);
        newTeam.setRegistration(registrationRepository.getRegistrationId(1));
        teamRepository.save(newTeam);

    }

    public Team getTeamById(Integer id) {
        Team teamById = teamRepository.getTeamById(id);
        return teamById;

    }
}
