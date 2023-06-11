package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Models.LeaderBoard;
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
public class LeaderBoardResponse {
    Integer Id;
    String Name;
    Integer wins;
    Integer losses;

    public static LeaderBoardResponse covertLeaderBoardToResponse(LeaderBoard requestFromLeaderBoard) {
        return LeaderBoardResponse.builder()
                .Id(requestFromLeaderBoard.getLeaderBoardId())
                .Name(requestFromLeaderBoard.getTeamName())
                .wins(requestFromLeaderBoard.getWins())
                .losses(requestFromLeaderBoard.getLosses())
                .build();
    }
    public static List<LeaderBoardResponse> convertRequestListToResponseList(List<LeaderBoard> LeaderBoardRequestFromUser) {
        List<LeaderBoardResponse> LeaderBoardResponseList = new ArrayList<>();
        if (!LeaderBoardRequestFromUser.isEmpty()) {
            for (LeaderBoard leaderBoardRequest : LeaderBoardRequestFromUser) {
                LeaderBoardResponseList.add(covertLeaderBoardToResponse(leaderBoardRequest));
            }
        }
        return LeaderBoardResponseList;
    }
}
