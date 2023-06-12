package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Registration;
import com.example.SportLeaderboard.Repository.RegistrationRepository;
import com.example.SportLeaderboard.RequestObject.RegistrationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public void RegisterTeam(RegistrationRequest registrationRequest) {
        Registration register = new Registration();
        register.setUserName(registrationRequest.getUserName());
        register.setTeamName(registrationRequest.getTeamName());
        register.setPassword(registrationRequest.getPassword());
        register.setSportType(registrationRequest.getSportType());
        register.setCreateDate(new Date());
        register.setIsActive(true);
        registrationRepository.save(register);
    }

    public Registration getRegistrationById(Integer id) {
        Registration registerById = registrationRepository.getRegistrationId(id);
        return registerById;

    }
}
