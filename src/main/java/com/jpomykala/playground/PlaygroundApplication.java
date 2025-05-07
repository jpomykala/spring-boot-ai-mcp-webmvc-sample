package com.jpomykala.playground;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlaygroundApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(PlaygroundApplication.class, args);
  }

  @Bean
  public ToolCallbackProvider myTools(HelloWorldService myService) {
    return MethodToolCallbackProvider.builder()
            .toolObjects(myService)
            .build();
  }
}
