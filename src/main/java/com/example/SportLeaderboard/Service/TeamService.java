package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Team;
import com.example.SportLeaderboard.Repository.RegistrationRepository;
import com.example.SportLeaderboard.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TeamService {
    @Autowired
    RegistrationRepository registrationRepository;
    @Autowired
    TeamRepository teamRepository;

    public void createTeam() {
        Team newTeam = new Team();
        newTeam.setLosses(1);
        newTeam.setWins(1);
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
