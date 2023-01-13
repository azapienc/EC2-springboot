package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

/**
 * UserController
 */
@RestController
public class UserController {
  @GetMapping
  public String demo() {
    return "Greetings";
  }
}
  