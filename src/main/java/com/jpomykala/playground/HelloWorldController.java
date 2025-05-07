package com.jpomykala.playground;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{

  @GetMapping("/say-hello")
  public HelloWorldResponse helloWorld()
  {
    return new HelloWorldResponse("Hello, World!");
  }

}
