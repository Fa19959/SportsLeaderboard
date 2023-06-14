package com.example.SportLeaderboard.ResponseObject;

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
@Builder //To chain method calls
public class LeaderBoardResponse {
    Integer Id;
    String Name;
    Integer wins;
    Integer losses;
    //builder(),Method is called to obtain the builder instance for the LeaderBoardResponse class.
    public static LeaderBoardResponse covertLeaderBoardToResponse(LeaderBoard requestFromLeaderBoard) {
        return LeaderBoardResponse.builder()
                .Id(requestFromLeaderBoard.getLeaderBoardId())
                .Name(requestFromLeaderBoard.getTeamName())
                .wins(requestFromLeaderBoard.getTeamWins())
                .losses(requestFromLeaderBoard.getTeamLosses())
                .build(); //called to create and return the final LeaderBoardResponse object
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
