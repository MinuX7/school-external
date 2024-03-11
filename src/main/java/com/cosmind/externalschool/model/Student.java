package com.cosmind.externalschool.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String schoolClass;
}
