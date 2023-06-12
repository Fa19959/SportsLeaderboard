package com.example.SportLeaderboard.Controller;

import com.example.SportLeaderboard.Models.Game;
import com.example.SportLeaderboard.Models.Registration;
import com.example.SportLeaderboard.RequestObject.RegistrationRequest;
import com.example.SportLeaderboard.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "Registration")
public class RegistrationController {
    @Autowired
    RegistrationService registrationService;

    @RequestMapping(value = "RegisterTeam", method = RequestMethod.POST)
    public void registerTeam(@RequestBody  RegistrationRequest registrationRequest) {
        registrationService.RegisterTeam(registrationRequest);
    }

    @RequestMapping(value = "getRegisterById", method = RequestMethod.GET)
    public Registration getRegistrationById(@RequestParam Integer id) {
        Registration registerById = registrationService.getRegistrationById(id);
        return registerById;
    }
}
