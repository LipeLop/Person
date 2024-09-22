package com.testpractice.apiperson.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Document {

    private Long id;
    private Long personId;
    private byte[] file;
    private String format;
    private Long choosenSystemId;
    private Boolean isFastCheck;
}
