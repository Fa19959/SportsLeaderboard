package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.Registration;
import com.example.SportLeaderboard.Models.Team;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@Builder
public class TeamResponse {
    Integer Id;
    Integer wins;
    Integer losses;
    Registration registration;

    public static TeamResponse covertTeamToResponse(Team requestFromTeam) {
        return TeamResponse.builder()
                .Id(requestFromTeam.getTeamId())
                .wins(requestFromTeam.getWins())
                .losses(requestFromTeam.getLosses())
                .registration(requestFromTeam.getRegistration())
                .build();
    }

    public static List<TeamResponse> convertRequestListToResponseList(List<Team> TeamRequestFromUser) {
        List<TeamResponse> TeamResponseList = new ArrayList<>();
        if (!TeamRequestFromUser.isEmpty()) {
            for (Team TeamRequest : TeamRequestFromUser) {
                TeamResponseList.add(covertTeamToResponse(TeamRequest));
            }
        }
        return TeamResponseList;
    }
}
