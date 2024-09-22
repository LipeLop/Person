package com.testpractice.apiperson.models;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Group {

    private Long id;
    private String name;
    private CheckLimits checkLimits;
    private Boolean status;
    private LocalDateTime createDate;
    private LocalDateTime endDate;
}
