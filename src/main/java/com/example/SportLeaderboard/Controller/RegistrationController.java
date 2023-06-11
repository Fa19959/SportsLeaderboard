package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Models.Registration;
import com.example.SportLeaderboard.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Registration")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "RegisterTeam", method = RequestMethod.POST)                 //Register Player
    public void registerTeam() {
        registrationService.RegisterTeam();
    }

    @RequestMapping(value = "getRegisterById", method = RequestMethod.GET)
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registerById = registrationService.getRegistrationById(id);
        return registerById;
    }
}
