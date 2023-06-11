package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Models.Team;
import com.example.SportLeaderboard.RequestObject.TeamRequest;
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
    TeamRequest tRequest1;
    TeamRequest tRequest2;
    Integer score1;
    Integer score2;

    public static GameResponse covertToResponse(Game requestFromGame) {
        return GameResponse.builder()
                .Id(requestFromGame.getGameId())
                .Description(requestFromGame.getGameDescription())
               //.tRequest1(requestFromGame.)
                .score1(requestFromGame.getScoreTeam1())
                .score2(requestFromGame.getScoreTeam2())
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
