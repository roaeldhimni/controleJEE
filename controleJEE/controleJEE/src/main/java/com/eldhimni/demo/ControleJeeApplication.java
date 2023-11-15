package com.eldhimni.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = "com.eldhimni.demo.entities")
@ComponentScan(basePackages = {"com.eldhimni.demo.controllers","com.eldhimni.demo.services"})
@EnableJpaRepositories(basePackages = "com.eldhimni.demo.repository")
@SpringBootApplication
public class ControleJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleJeeApplication.class, args);
	}

}
