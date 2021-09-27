package com.codewithflex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@ComponentScan(basePackages = {"come.codewithflex"})
@EntityScan("come.codewithflex.model")
@EnableJpaRepositories("com.codewithflex.repository")
public class EmployeeRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRegistrationAppApplication.class, args);
	}

}
