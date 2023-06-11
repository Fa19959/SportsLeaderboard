package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.LeaderBoard;
import com.example.SportLeaderboard.Models.Player;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@Builder
public class PlayerResponse {
    Integer Id;
    String Name;
    String tName;
    String sport;
    public static PlayerResponse covertPlayerToResponse(Player requestFromPlayer) {
        return PlayerResponse.builder()
                .Id(requestFromPlayer.getPlayerId())
                .Name(requestFromPlayer.getPlayerName())
                .tName(requestFromPlayer.getTeamName())
                .sport(requestFromPlayer.getSport())
                .build();
    }

    public static List<PlayerResponse> convertRequestListToResponseList(List<Player> PlayerRequestFromUser) {
        List<PlayerResponse> PlayerResponseList = new ArrayList<>();
        if (!PlayerRequestFromUser.isEmpty()) {
            for (Player playerRequest : PlayerRequestFromUser) {
                PlayerResponseList.add(covertPlayerToResponse(playerRequest));
            }
        }
        return PlayerResponseList;
    }
}
