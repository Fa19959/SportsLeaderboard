package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.Team;
import com.example.SportLeaderboard.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Team")
public class TeamController {
    @Autowired
    TeamService teamService;

    @RequestMapping(value = "RegisterNewTeam", method = RequestMethod.POST)                 //Register Player
    public void registerNewTeam() {
        teamService.createTeam();
    }

    @RequestMapping( value = "getTeamById", method = RequestMethod.GET)
    public Team getTeamById(@RequestParam Integer id) {
        Team teamById = teamService.getTeamById(id);
        return teamById;
    }
}
