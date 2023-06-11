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
        game.setGameDescription(request.getGameDescription());
        game.setTeam1(TeamRequest.convertToTeamRequest(request.getTeamRequest1()));
        game.setTeam2(TeamRequest.convertToTeamRequest(request.getTeamRequest2()));
        game.setScoreTeam1(request.getScoreTeam1());
        game.setScoreTeam2(request.getScoreTeam2());
        return game;

    }

//    public static Game convert(GameRequest request) {
//
//        Game game = new Game();
//
//        game.setGameDescription(request.getGameDescription());
//        game.setTeam1(request.getCustomerPhoneNumber());
//        customer.setCustomerEmail(request.getCustomerEmail());
//        customer.setCustomerPaymentMethod(request.getCustomerPaymentMethod());
//        customer.setIsActive(true);
//        customer.setCreatedDate(new Date());
//        return customer;
//    }

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

