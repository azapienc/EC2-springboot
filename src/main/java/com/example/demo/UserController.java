package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 */
@RestController
public class UserController {
  @GetMapping
  public String demo() {
    return "Greetings from the ether";
  }
}
  