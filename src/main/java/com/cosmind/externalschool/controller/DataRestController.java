package com.cosmind.externalschool.controller;

import com.cosmind.externalschool.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataRestController {

    @GetMapping("")
    Student getStudent() {
        return new Student(1l, "Cosmin", "Xulescu", 1990, "XI");
    }
}
