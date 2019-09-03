package hu.procyon.seedling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SeedlingWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeedlingWebApplication.class, args);
	}

}
