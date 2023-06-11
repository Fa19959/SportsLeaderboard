package com.example.SportLeaderboard.Models;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass // main class inheritince
// to make sure no reption of the code

public class BaseEntity {
    @CreatedDate
    Date createDate;
    @UpdateTimestamp
    Date updateDate;
    Boolean isActive;
}
