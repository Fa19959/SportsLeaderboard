package com.example.SportLeaderboard.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Data
public class Game extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer gameId;
    String gameDescription;
    @OneToOne
    @JoinColumn(name = "team1_id",referencedColumnName = "id")
    Team team1;
    @OneToOne
    @JoinColumn(name = "team2_id",referencedColumnName = "id")
    Team team2;
    Integer scoreTeam1;
    Integer scoreTeam2;

}
