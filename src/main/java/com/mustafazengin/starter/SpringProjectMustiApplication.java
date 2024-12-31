package com.mustafazengin.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.mustafazengin"})
@ComponentScan(basePackages = {"com.mustafazengin"})
@EnableJpaRepositories(basePackages = {"com.mustafazengin"})
@PropertySource(value ="classpath:app.properties")
public class SpringProjectMustiApplication {

	public static void main(String[] args) {


		SpringApplication.run(SpringProjectMustiApplication.class, args);

	}

}
