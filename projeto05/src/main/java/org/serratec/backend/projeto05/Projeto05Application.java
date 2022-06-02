package org.serratec.backend.projeto05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Projeto05Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto05Application.class, args);
	}
	
	

}
