package com.example.SportLeaderboard.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Team extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    // To Genarate Primary key
    @Column(name = "id")
    Integer teamId;
    Integer wins;
    Integer losses;
    @OneToOne
    @JoinColumn(name = "register_id",referencedColumnName = "id") // FK
    Registration registration;

}
