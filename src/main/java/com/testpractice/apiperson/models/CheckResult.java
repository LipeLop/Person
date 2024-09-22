package com.testpractice.apiperson.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CheckResult {
    private Long id;
    private Long personId;
    private Document document;
    private String status;
    private Boolean isCheckFinished;
    private String resultLink;
    private LocalDateTime checkDate;
}
