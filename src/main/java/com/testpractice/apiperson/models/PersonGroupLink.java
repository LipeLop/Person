package com.testpractice.apiperson.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PersonGroupLink {

    private Long id;
    private Group group;
    private Long personId;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean status;
}
