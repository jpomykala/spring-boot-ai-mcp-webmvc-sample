package com.jpomykala.playground;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService
{

  @Tool(description = "This is a simple hello world service.")
  public HelloWorldResponse sayHello()
  {
    return new HelloWorldResponse("Hello, World!");
  }

}
