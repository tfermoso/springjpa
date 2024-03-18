package com.example.demoNuevo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoNuevoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoNuevoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoNuevoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserRepository userRepository) {
		return (args) -> {
				User user=new User();
				user.setUsername("prueba1");
				user.setPassword("12324");
				user.setIdrol(1);
				userRepository.save(user);
		};
	}
}
