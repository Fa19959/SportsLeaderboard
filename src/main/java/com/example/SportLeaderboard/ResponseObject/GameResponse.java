package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.Game;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Data
@Builder
public class GameResponse {
    Integer Id;
    String Description;
    TeamResponse teamOneResponse;
    TeamResponse teamTwoResponse;
    Integer score1;
    Integer score2;

    public static GameResponse covertToResponse(Game requestFromGame) {
        return GameResponse.builder()
                .Id(requestFromGame.getId())
                .Description(requestFromGame.getDescription())
                .teamOneResponse(TeamResponse.covertTeamToResponse(requestFromGame.getTeamOne()))
                .teamTwoResponse(TeamResponse.covertTeamToResponse(requestFromGame.getTeamTwo()))
                .score1(requestFromGame.getScoreOfTeamOne())
                .score2(requestFromGame.getScoreOfTeamTwo())
                .build();
    }

    public static List<GameResponse> convertRequestListToResponseList(List<Game> GameRequestFromUser) {
        List<GameResponse> gameResponseList = new ArrayList<>();
        if (!GameRequestFromUser.isEmpty()) {
            for (Game gameRequest : GameRequestFromUser) {
                gameResponseList.add(covertToResponse(gameRequest));
            }
        }
        return gameResponseList;
    }
}
