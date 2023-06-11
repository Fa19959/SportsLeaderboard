package com.example.SportLeaderboard.Service;

import com.example.SportLeaderboard.Models.Registration;
import com.example.SportLeaderboard.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegistrationService {
    @Autowired
    RegistrationRepository registrationRepository;

    public void RegisterTeam() {
        Registration register = new Registration();
        register.setTeamName("DRR");
        register.setPassword("12334");
        register.setSportType("football");
        register.setCreateDate(new Date());
        register.setIsActive(true);
        registrationRepository.save(register);
    }

    public Registration getRegistrationById(Integer id) {
        Registration registerById = registrationRepository.getRegistrationId(id);
        return registerById;

    }
}
