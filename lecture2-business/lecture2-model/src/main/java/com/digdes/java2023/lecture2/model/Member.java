package com.digdes.java2023.lecture2.model;

import lombok.Data;

import java.io.Serializable;
@Data
public class Member implements Serializable {

    private Long id;
    private String lastName;
    private String firstName;
}
