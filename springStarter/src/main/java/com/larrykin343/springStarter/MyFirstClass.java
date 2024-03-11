package com.larrykin343.springStarter;

import org.springframework.context.annotation.Bean;

public class MyFirstClass {

    //this method will be called from SpringStarterApplication.java
    public String sayHello() {
        return "Hello from MyFirstClass!";
    }

}
