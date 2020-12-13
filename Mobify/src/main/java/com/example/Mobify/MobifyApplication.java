package com.example.Mobify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan("com.example")
@EntityScan( basePackages = {"com.example.Model"})

@EnableJpaRepositories(basePackages = {"com.example.Repository"})
public class MobifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobifyApplication.class, args);
	}

}
