package com.gendron.mvnProject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gendron.mvnProject2")
@SpringBootApplication

/*
 * Code that is preceded by the @symbol are called annotations. 
 * They provide metadata to our applications to help with some configuration
 * behind the scenes.
 * The @ComponentScan tells our application that the base package that 
 * we're going to scan for components to include in our web API
 * the web API is the base package we have set here is the .mvnProject2
 * So the component scan is going to look for all components 
 * and any of the sub packages in that web API package.
 * 
 * The SpringBoot Application tells springboot that this is where the app starts. 
 */

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
