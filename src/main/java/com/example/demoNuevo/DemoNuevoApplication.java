package com.example.demoNuevo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoNuevoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoNuevoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DemoNuevoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {

            Optional<User> user = userRepository.findById(66);
            user.ifPresent(value -> System.out.println(value.toString()));

            User user1= (userRepository.findUserByUsername("Luis"));
            System.out.println(user1.toString());
/*
            List<User> userList= (List<User>) userRepository.findAll();
            for (int i = 0; i <userList.size(); i++) {
                System.out.println(userList.get(i).toString());
            }

 */
				/*
				User user=new User();
				user.setUsername("prueba1");
				user.setPassword("12324");
				user.setIdrol(1);
				userRepository.save(user);

				userRepository.find

			 /*
			Rol rol=new Rol();
			rol.setDescription("prueba");
			rolRepository.save(rol);

			  */
        };
    }
}
