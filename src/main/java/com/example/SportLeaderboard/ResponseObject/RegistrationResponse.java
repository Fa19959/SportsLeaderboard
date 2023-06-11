package com.example.SportLeaderboard.ResponseObject;

import com.example.SportLeaderboard.Models.Player;
import com.example.SportLeaderboard.Models.Registration;
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
public class RegistrationResponse {
    Integer Id;
    String user;
    String password;
    String tName;
    String sportType;

    public static RegistrationResponse covertRegistrationToResponse(Registration requestFromRegistration) {
        return RegistrationResponse.builder()
                .Id(requestFromRegistration.getRegisterId())
                .user(requestFromRegistration.getUserName())
                .password(requestFromRegistration.getPassword())
                .tName(requestFromRegistration.getTeamName())
                .sportType(requestFromRegistration.getSportType())
                .build();
    }
    public static List<RegistrationResponse> convertRequestListToResponseList(List<Registration> RegistrationRequestFromUser) {
        List<RegistrationResponse> RegistrationResponseList = new ArrayList<>();
        if (!RegistrationRequestFromUser.isEmpty()) {
            for (Registration registrationRequest : RegistrationRequestFromUser) {
                RegistrationResponseList.add(covertRegistrationToResponse(registrationRequest));
            }
        }
        return RegistrationResponseList;
    }
}
