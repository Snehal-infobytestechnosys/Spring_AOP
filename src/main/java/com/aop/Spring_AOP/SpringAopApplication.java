package com.aop.Spring_AOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringAopApplication.class, args);
		System.out.println("Run");
	}

}
