package com.example.SportLeaderboard.RequestObject;

import com.example.SportLeaderboard.Models.Game;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
public class GameRequest {
    Integer gameId;
    String gameDescription;
    TeamRequest teamRequest1;
    TeamRequest teamRequest2;
    Integer scoreTeam1;
    Integer scoreTeam2;

    public static Game convertToGameRequest(GameRequest request) {
        Game game = new Game();
        game.setDescription(request.getGameDescription());
        game.setTeamOne(TeamRequest.convertToTeamRequest(request.getTeamRequest1()));
        game.setTeamTwo(TeamRequest.convertToTeamRequest(request.getTeamRequest2()));
        game.setScoreOfTeamOne(request.getScoreTeam1());
        game.setScoreOfTeamTwo(request.getScoreTeam2());
        return game;

    }

    public static List<Game> convertListToGameRequest(List<GameRequest> gameRequestList) {
        List<Game> gameList = new ArrayList<>();
        if (!gameRequestList.isEmpty()) {
            for (GameRequest gameRequest : gameRequestList) {
                gameList.add(convertToGameRequest(gameRequest));
            }
        }
        return gameList;

    }


}

