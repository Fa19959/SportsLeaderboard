package com.example.SportLeaderboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SportLeaderboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportLeaderboardApplication.class, args);
	}

}
