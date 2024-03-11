package com.larrykin343.springStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//this annotation tells Spring that this is the main class,Spring boot application
public class SpringStarterApplication {


	public static void main(String[] args) {
		var ctx = SpringApplication.run(SpringStarterApplication.class, args);//this line launches the spring boot application

		//this line creates an instance of MyFirstClass and calls the sayHello method
		MyFirstClass myFirstClass = ctx.getBean(MyFirstClass.class);
		System.out.println(myFirstClass.sayHello());
	}

}
